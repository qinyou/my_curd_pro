package com.mycurdpro.system.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Generated baseModel
 * DB table: SYS_FILE  用户上传的文件
 * @author zhangchuang
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysFile<M extends BaseSysFile<M>> extends Model<M> implements IBean {
     // 主键id
     public String getId() {
        return get("ID");
     }
     public M setId(String id) {
        set("ID", id);
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

     // 预留其它表主键
     public String getSaveId() {
        return get("SAVE_ID");
     }
     public M setSaveId(String saveId) {
        set("SAVE_ID", saveId);
        return (M)this;
     }

     // 文件存储地址
     public String getPath() {
        return get("PATH");
     }
     public M setPath(String path) {
        set("PATH", path);
        return (M)this;
     }

     // 文件原名
     public String getOriName() {
        return get("ORI_NAME");
     }
     public M setOriName(String oriName) {
        set("ORI_NAME", oriName);
        return (M)this;
     }

     // MIME类型
     public String getMime() {
        return get("MIME");
     }
     public M setMime(String mime) {
        set("MIME", mime);
        return (M)this;
     }

     // 文件类型（文件后缀）
     public String getType() {
        return get("TYPE");
     }
     public M setType(String type) {
        set("TYPE", type);
        return (M)this;
     }

     // 文件大小（单位B字节)
     public BigDecimal getSize() {
        return get("SIZE");
     }
     public M setSize(BigDecimal size) {
        set("SIZE", size);
        return (M)this;
     }

     // 备注
     public String getRemark() {
        return get("REMARK");
     }
     public M setRemark(String remark) {
        set("REMARK", remark);
        return (M)this;
     }

}