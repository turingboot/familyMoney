package com.Entity;

 public class Consume {

     private String consumeID;
     private String consumeName;

     public Consume(){}

     public Consume(String consumeID, String consumeName) {
         this.consumeID = consumeID;
         this.consumeName = consumeName;
     }


     public String getConsumeID() {
         return consumeID;
     }

     public void setConsumeID(String consumeID) {
         this.consumeID = consumeID;
     }

     public String getConsumeName() {
         return consumeName;
     }

     public void setConsumeName(String consumeName) {
         this.consumeName = consumeName;
     }

 }
