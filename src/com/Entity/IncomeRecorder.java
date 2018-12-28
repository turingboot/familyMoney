package com.Entity;

public class IncomeRecorder {
    private String RecordID;
    private String UserID;
    private String IncomeID;
    private double IncomeAmount;
    private java.util.Date Date;

    public IncomeRecorder(String recordID, String userID, String incomeID, double incomeAmount, java.util.Date date) {
        super();
        RecordID = recordID;
        UserID = userID;
        IncomeID = incomeID;
        IncomeAmount = incomeAmount;
        Date = date;
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
    public java.util.Date getDate() {
        return Date;
    }
    public void setDate(java.util.Date date) {
        Date = date;
    }

}
