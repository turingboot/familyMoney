package com.Service;

import com.DAO.UserDAO;
import com.Entity.User;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public void  addUser(String userID,String userName,String userPassword,int userGrade){

        User user = new User(userID,userName,userPassword,userGrade);

        userDAO.add(user);

    }


}

