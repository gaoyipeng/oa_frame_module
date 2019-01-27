package com.sxdx.oa_service.rabbitmqTest.model;

/**
 * @author gaoypieng
 * @create 2018-11-18 11:34
 */
public class Notice {
    private String noticeName;
    private String noticeMessage;

    public String getNoticeName() {
        return noticeName;
    }

    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
    }

    public String getNoticeMessage() {
        return noticeMessage;
    }

    public void setNoticeMessage(String noticeMessage) {
        this.noticeMessage = noticeMessage;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeName='" + noticeName + '\'' +
                ", noticeMessage='" + noticeMessage + '\'' +
                '}';
    }
}
