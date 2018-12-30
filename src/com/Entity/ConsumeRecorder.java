package com.Entity;

import java.util.Date;
public  class ConsumeRecorder {

    private String recordID;
    private String UserID;
    private String ConsumeID;
    private double Cost;
    private Date date;

    public ConsumeRecorder(String userID, String consumeID, double cost, Date date) { ;
        UserID = userID;
        ConsumeID = consumeID;
        Cost = cost;
        this.date = date;
    }


    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getConsumeID() {
        return ConsumeID;
    }

    public void setConsumeID(String consumeID) {
        ConsumeID = consumeID;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
