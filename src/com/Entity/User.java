package com.Entity;

public class User {

     private String userID;
     private  String userName;
     private String userPassword;
     private String userEmail;
     private String userSex;
     private String userJob;
     private int userGrade;

     public User(String userID, String userName, String userPassword, int userGrade) {
         this.userID = userID;
         this.userName = userName;
         this.userPassword = userPassword;
         this.userGrade = userGrade;
     }

     public User(String userName,String userEmail,String userSex,String userJob){
         this.userName=userName;
         this.userEmail=userEmail;
         this.userSex=userSex;
         this.userJob=userJob;
     }

     public String getUserID() {
         return userID;
     }

     public void setUserID(String userID) {
         this.userID = userID;
     }

     public String getUserName() {
         return userName;
     }

     public void setUserName(String userName) {
         this.userName = userName;
     }

     public String getUserPassword() {
         return userPassword;
     }

     public void setUserPassword(String userPassword) {
         this.userPassword = userPassword;
     }

     public int getUserGrade() {
         return userGrade;
     }

     public void setUserGrade(int userGrade) {
         this.userGrade = userGrade;
     }

     public String getUserEmail() {
        return userEmail;
    }

     public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

     public String getUserSex() {
        return userSex;
    }

     public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

     public String getUserJob() {
        return userJob;
    }

     public void setUserJob(String userJob) {
        this.userJob = userJob;
    }
}

