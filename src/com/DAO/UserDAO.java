package com.DAO;

import com.Entity.User;
import com.tools.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.tools.MD5Utils.toMd5;


public class UserDAO {
     public void add(User user){

         String sql = "INSERT INTO user(userID,userName,userPassword,userGrade)  VALUES(?,?,?,?)";
         try(Connection c = JDBCUtils.getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
           ps.setString(1,user.getUserID());
           ps.setString(2,user.getUserName());
           ps.setString(3,toMd5(user.getUserPassword()));
           ps.setInt(4,user.getUserGrade());
           ps.execute();
         } catch (SQLException e) {
             e.printStackTrace();
         }


     }






}
