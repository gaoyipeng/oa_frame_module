package com.sxdx.oa_service.rabbitmqTest.model;

/**
 * @author gaoypieng
 * @create 2018-11-18 11:32
 */
public class New {
    private String newName;
    private String mewMessge;

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getMewMessge() {
        return mewMessge;
    }

    public void setMewMessge(String mewMessge) {
        this.mewMessge = mewMessge;
    }

    @Override
    public String toString() {
        return "New{" +
                "newName='" + newName + '\'' +
                ", mewMessge='" + mewMessge + '\'' +
                '}';
    }
}
