package com.Service;

import com.DAO.UserDAO;
import com.Entity.User;


public class UserService {

    private UserDAO userDAO = new UserDAO();

    public void  UserRegister(String userID,String userName,String userPassword,int userGrade){

        User user = new User(userID,userName,userPassword,userGrade);

        userDAO.add(user);

    }

    public boolean UserLogin(String id,String password){

          if(userDAO.selectInfor(id,"UserPassword").equals(password))
              return true;

          else

              return false;
    }


    public String getExitsName(String id){

        return userDAO.selectInfor(id,"UserName");

    }

    public boolean updateInfor(String id,String username,String useremail,String usersex,String userjob){
        User user = new User(username,useremail,usersex,userjob);
        if(userDAO.updateUser(id,user))
           return true;
        else
            return false;

    }



}

