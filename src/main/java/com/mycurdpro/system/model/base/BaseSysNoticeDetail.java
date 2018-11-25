package com.mycurdpro.system.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

import java.util.Date;

/**
 * Generated baseModel
 * DB table: SYS_NOTICE_DETAIL  通知消息从表（发送人接收人）
 * @author zhangchuang
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysNoticeDetail<M extends BaseSysNoticeDetail<M>> extends Model<M> implements IBean {
     // 主键id
     public String getId() {
        return get("ID");
     }
     public M setId(String id) {
        set("ID", id);
        return (M)this;
     }

     // 通知id
     public String getSysNoticeId() {
        return get("SYS_NOTICE_ID");
     }
     public M setSysNoticeId(String sysNoticeId) {
        set("SYS_NOTICE_ID", sysNoticeId);
        return (M)this;
     }

     // 消息发送人
     public String getSender() {
        return get("SENDER");
     }
     public M setSender(String sender) {
        set("SENDER", sender);
        return (M)this;
     }

     // 消息接收人
     public String getReceiver() {
        return get("RECEIVER");
     }
     public M setReceiver(String receiver) {
        set("RECEIVER", receiver);
        return (M)this;
     }

     // 使用阅读YN
     public String getHasRead() {
        return get("HAS_READ");
     }
     public M setHasRead(String hasRead) {
        set("HAS_READ", hasRead);
        return (M)this;
     }

     // 阅读时间
     public Date getReadTime() {
        return get("READ_TIME");
     }
     public M setReadTime(Date readTime) {
        set("READ_TIME", readTime);
        return (M)this;
     }

}
