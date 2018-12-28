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


    public String selectInfor(String id,String sign) {
        String str = "";
        String sql = String.format("SELECT UserID,%s FROM user WHERE UserID = %s",sign,id);
        try (Connection c = JDBCUtils.getConnection(); Statement s = c.createStatement()) {

            ResultSet rs = s.executeQuery(sql);
            if (rs.next())
               str = rs.getString(sign);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return str;
    }

    public boolean updateUser(String id,User user){
        boolean isUpadte = false;
        String sql = String.format("UPDATE user SET UserName=?,UserEmail=?,UserSex=?,UserJob=? WHERE  UserID = %s",id);
        System.out.println(sql);
        try (Connection c = JDBCUtils.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getUserEmail());
            ps.setString(3, user.getUserSex());
            ps.setString(4, user.getUserJob());
            ps.execute();
            isUpadte = true;
        } catch (SQLException e) {
           e.printStackTrace();
            return isUpadte;
        }
     return isUpadte;
    }

    public boolean updatePSW(String id,String psw){
        boolean isUpadte = false;
        String sql = String.format("UPDATE user SET UserPassword='%s' WHERE  UserID = %s",toMd5(psw),id);
        System.out.println(sql);
        try (Connection c = JDBCUtils.getConnection(); Statement s = c.createStatement()) {
            s.execute(sql);
            isUpadte = true;
        } catch (SQLException e) {
            e.printStackTrace();
            return isUpadte;
        }
        return isUpadte;
    }


    public static void main(String[] args){
         User user = new User("zhang","22.com","man","stu");
        if(new UserDAO().updatePSW("5","3333"));


    }

}

