package com.Service;

import com.DAO.UserDAO;
import com.Entity.User;
import com.tools.MD5Utils;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public void  UserRegister(String userID,String userName,String userPassword,int userGrade){

        User user = new User(userID,userName,userPassword,userGrade);

        userDAO.add(user);

    }

    public boolean UserLogin(String id,String password){

          if(userDAO.selectPassword(id).equals(password))
              return true;

          else

              return false;
    }





}

