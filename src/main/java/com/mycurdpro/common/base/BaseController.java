package com.mycurdpro.common.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.core.Controller;
import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.mycurdpro.common.utils.WebUtils;
import com.mycurdpro.system.service.SysServiceLogService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * controller 基类，封装一些Controller 中使用的公共方法
 *
 * @author zhangchuang
 */
public abstract class BaseController extends Controller {

    /**
     * 返回datagrid json 数据
     *
     * @param pageData
     */
    protected void renderDatagrid(Page<?> pageData) {
        Map<String, Object> datagrid = new HashMap<String, Object>();
        datagrid.put("rows", pageData.getList());
        datagrid.put("total", pageData.getTotalRow());
        renderJson(datagrid);
    }

    /**
     * 返回datagrid json 数据
     *
     * @param list
     * @param total
     */
    protected void renderDatagrid(List<?> list, int total) {
        renderDatagrid(list, total, null);
    }

    /**
     * 返回datagrid json 数据
     *
     * @param list
     * @param total
     * @param footer
     */
    protected void renderDatagrid(List<?> list, int total, List<Map<String, Object>> footer) {
        Map<String, Object> datagrid = new HashMap<String, Object>();
        datagrid.put("rows", list);
        datagrid.put("total", total);
        if (footer != null && footer.size() > 0) {
            datagrid.put("footer", footer);
        }
        renderJson(datagrid);
    }

    /**
     * 返回datagrid json 数据, 无分页
     *
     * @param list
     */
    protected void renderDatagrid(List<Record> list) {
        Map<String, Object> datagrid = new HashMap<String, Object>();
        datagrid.put("rows", list);
        renderJson(datagrid);
    }


    /**
     * 成功操作
     */
    protected void renderSuccess() {
        Ret ret = Ret.create().setOk();
        renderJson(ret);
    }

    /**
     * 成功操作
     *
     * @param msg
     */
    protected void renderSuccess(String msg) {
        Ret ret = Ret.create().setOk().set("msg", msg);
        renderJson(ret);
    }

    /**
     * 成功操作
     *
     * @param data
     */
    protected void renderSuccess(List<Object> data) {
        Ret ret = Ret.create().setOk().set("data", data);
        renderJson(ret);
    }

    /**
     * 成功操作
     *
     * @param msg
     * @param data
     */
    protected void renderSuccess(String msg, List<Object> data) {
        Ret ret = Ret.create().setOk().set("msg", msg).set("data", data);
        renderJson(ret);
    }


    /**
     * 失败操作
     */
    protected void renderFail() {
        Ret ret = Ret.create().setFail();
        renderJson(ret);
    }

    /**
     * 失败操作
     *
     * @param msg
     */
    protected void renderFail(String msg) {
        Ret ret = Ret.create().setFail().set("msg", msg);
        renderJson(ret);
    }

    /**
     * 失败操作
     *
     * @param data
     */
    protected void renderFail(List<Object> data) {
        Ret ret = Ret.create().setFail().set("data", data);
        renderJson(ret);
    }

    /**
     * 失败操作
     *
     * @param msg
     * @param data
     */
    protected void renderFail(String msg, List<Object> data) {
        Ret ret = Ret.create().setFail().set("msg", msg).set("data", data);
        renderJson(ret);
    }

    /**
     * 获取 http 请求 body json 数据
     */
    protected JSONObject readRawDataAsJson() {
        String rawData = getRawData();
        return JSON.parseObject(rawData);
    }


    /**
     * 添加业务日志
     *
     * @param content
     */
    public void addServiceLog(String content) {
        SysServiceLogService.addServiceLog(WebUtils.getSessionUsername(this)
                , WebUtils.getRemoteAddress(getRequest())
                , getRequest().getRequestURI(), content);
    }
}

