package com.Entity;

public class Income {
    private String incomeID;
    private String incomeName;
    private int recoderNumbers;
    public Income(){};
    public Income(String incomeID, String incomeName) {
        super();
        this.incomeID = incomeID;
        this.incomeName = incomeName;
    }
    public int getRecoderNumbers() {
        return recoderNumbers;
    }

    public void setRecoderNumbers(int recoderNumbers) {
        this.recoderNumbers = recoderNumbers;
    }


    public String getIncomeID() {
        return incomeID;
    }
    public void setIncomeID(String incomeID) {
        this.incomeID = incomeID;
    }
    public String getIncomeName() {
        return incomeName;
    }
    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }

}
