package com.DAO;

import com.Entity.User;
import com.tools.JDBCUtils;


import java.sql.*;

import static com.tools.MD5Utils.toMd5;


public class UserDAO {

    public void add(User user) {

        String sql = "INSERT INTO user(userID,userName,userPassword,userGrade)  VALUES(?,?,?,?)";
        try (Connection c = JDBCUtils.getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
            ps.setString(1, user.getUserID());
            ps.setString(2, user.getUserName());
            ps.setString(3, toMd5(user.getUserPassword()));
            ps.setInt(4, user.getUserGrade());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public String selectPassword(String id) {
        String password = "";
        String sql = String.format("SELECT UserID,UserPassword FROM user WHERE UserID = %s", id);
        try (Connection c = JDBCUtils.getConnection(); Statement s = c.createStatement()) {

            ResultSet rs = s.executeQuery(sql);
            if (rs.next())//如果查询出对应ID的密码
               password = rs.getString("UserPassword");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return password;
    }





    public static  void main(String[] args){
        System.out.println(new UserDAO().selectPassword("55555"));
    }
}

