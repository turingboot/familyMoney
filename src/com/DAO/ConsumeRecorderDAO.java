package com.DAO;

import com.Entity.ConsumeRecorder;
import com.tools.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsumeRecorderDAO {

    public boolean add(ConsumeRecorder consumeRecorder) {
        boolean isAdd = false;
        String sql = "INSERT INTO consumerecoder(RecordID,UserID,ConsumeID,Cost,Date)  VALUES(null,?,?,?,?)";
        try (Connection c = JDBCUtils.getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
            ps.setString(1,consumeRecorder.getUserID());
            ps.setString(2,consumeRecorder.getConsumeID());
            ps.setDouble(3,consumeRecorder.getCost());
            ps.setDate(4,new java.sql.Date(consumeRecorder.getDate().getTime()));
            ps.execute();
            isAdd=true;
        } catch (SQLException e) {
            e.printStackTrace();
            isAdd=false;
        }
        return isAdd;
    }

}
