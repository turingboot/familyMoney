package com.Entity;

import java.util.Date;
public class IncomeRecorder {
    private String RecordID;
    private String UserID;
    private String IncomeID;
    private double IncomeAmount;
    private Date date;

    public IncomeRecorder(String userID, String incomeID, double incomeAmount, Date date) {
        super();
        UserID = userID;
        IncomeID = incomeID;
        IncomeAmount = incomeAmount;
         this.date= date;
    }
    public String getRecordID() {
        return RecordID;
    }
    public void setRecordID(String recordID) {
        RecordID = recordID;
    }
    public String getUserID() {
        return UserID;
    }
    public void setUserID(String userID) {
        UserID = userID;
    }
    public String getIncomeID() {
        return IncomeID;
    }
    public void setIncomeID(String incomeID) {
        IncomeID = incomeID;
    }
    public double getIncomeAmount() {
        return IncomeAmount;
    }
    public void setIncomeAmount(double incomeAmount) {
        IncomeAmount = incomeAmount;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(java.util.Date date) {
        this.date = date;
    }

}
