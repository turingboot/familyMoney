package com.DAO;

import com.Entity.Consume;
import com.tools.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsumeDAO {
    public  List<Consume> list() {
        List<Consume> consumes = new ArrayList<Consume>();
        String sql = "select * from consume ";//选出所有分类
        try (Connection c = JDBCUtils.getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Consume consume = new Consume();
                String id = rs.getString("ConsumeID");
                String name = rs.getString("ConsumeName");
                consume.setConsumeID(id);
                consume.setConsumeName(name);
                consumes.add(consume);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return consumes;
    }

    public  boolean add(Consume consume){
        boolean isAdd = false;
        String sql = "INSERT INTO consume(ConsumeID,ConsumeName)  VALUES(?,?)";
        try (Connection c = JDBCUtils.getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
            ps.setString(1,consume.getConsumeID());
            ps.setString(2,consume.getConsumeName());
            ps.execute();
            isAdd =true;
        } catch (SQLException e) {
            e.printStackTrace();
            return isAdd;
        }
        return isAdd;
    }


    public  boolean upDate(String id,String name){
        boolean isUpdate = false;
        String sql = String.format("UPDATE consume SET ConsumeName = ? WHERE ConsumeID = %s",id);
        try (Connection c = JDBCUtils.getConnection(); PreparedStatement p = c.prepareStatement(sql)) {
            p.setString(1,name);
            p.execute();
            isUpdate =true;
        } catch (SQLException e) {
            e.printStackTrace();
            return isUpdate;
        }
        return isUpdate;
    }

    public String selectInfor(String name,String sign) {
        String str = "";
        String sql = String.format("SELECT %s FROM consume WHERE consumeName = '%s' ",sign,name);
        try (Connection c = JDBCUtils.getConnection(); Statement s = c.createStatement()) {
            ResultSet rs = s.executeQuery(sql);
            if (rs.next())
                str = rs.getString(sign);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return str;
    }
    
}
