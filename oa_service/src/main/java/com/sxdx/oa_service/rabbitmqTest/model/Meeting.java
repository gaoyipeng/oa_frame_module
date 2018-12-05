package com.sxdx.oa_service.rabbitmqTest.model;

/**
 * @author gaoypieng
 * @create 2018-11-18 11:31
 */
public class Meeting {
    private String meetingName;
    private String meetingContent;

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getMeetingContent() {
        return meetingContent;
    }

    public void setMeetingContent(String meetingContent) {
        this.meetingContent = meetingContent;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "meetingName='" + meetingName + '\'' +
                ", meetingContent='" + meetingContent + '\'' +
                '}';
    }
}
