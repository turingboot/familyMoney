package com.tools;
import java.sql.*;


 class JDBCUtils {

     static String url = "jdbc:mysql://localhost:3306/money?useUnicode=true&characterEncoding=UTF-8&" +
             "useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL";//连接数据库的URL
     static String username = "root"; //登录数据库的账号
     static String password = "123456";//登录数据库的密码


     public static Connection getConnection() throws SQLException{

         return DriverManager.getConnection(url,username,password);//返回一个数据库连接

     }


 }