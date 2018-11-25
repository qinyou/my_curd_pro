package com.mycurdpro.system.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

import java.util.Date;

/**
 * Generated baseModel
 * DB table: SYS_DICT_GROUP  字典编码分组
 * @author zhangchuang
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysDictGroup<M extends BaseSysDictGroup<M>> extends Model<M> implements IBean {
     // 主键ID
     public String getId() {
        return get("ID");
     }
     public M setId(String id) {
        set("ID", id);
        return (M)this;
     }

     // 分组名
     public String getGroupName() {
        return get("GROUP_NAME");
     }
     public M setGroupName(String groupName) {
        set("GROUP_NAME", groupName);
        return (M)this;
     }

     // 分组编码
     public String getGroupCode() {
        return get("GROUP_CODE");
     }
     public M setGroupCode(String groupCode) {
        set("GROUP_CODE", groupCode);
        return (M)this;
     }

     // 创建人
     public String getCreater() {
        return get("CREATER");
     }
     public M setCreater(String creater) {
        set("CREATER", creater);
        return (M)this;
     }

     // 创建时间
     public Date getCreateTime() {
        return get("CREATE_TIME");
     }
     public M setCreateTime(Date createTime) {
        set("CREATE_TIME", createTime);
        return (M)this;
     }

     // 最后修改人
     public String getUpdater() {
        return get("UPDATER");
     }
     public M setUpdater(String updater) {
        set("UPDATER", updater);
        return (M)this;
     }

     // 最后修改时间
     public Date getUpdateTime() {
        return get("UPDATE_TIME");
     }
     public M setUpdateTime(Date updateTime) {
        set("UPDATE_TIME", updateTime);
        return (M)this;
     }

}
