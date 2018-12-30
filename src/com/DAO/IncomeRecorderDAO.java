package com.DAO;

import com.Entity.IncomeRecorder;
import com.tools.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class IncomeRecorderDAO {

    public boolean add(IncomeRecorder incomeRecorder) {
        boolean isAdd = false;
        String sql = "INSERT INTO incomeRecoder(RecordID,UserID,incomeID,incomeAmount,Date)  VALUES(null,?,?,?,?)";
        try (Connection c = JDBCUtils.getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
            ps.setString(1,incomeRecorder.getUserID());
            ps.setString(2,incomeRecorder.getIncomeID());
            ps.setDouble(3,incomeRecorder.getIncomeAmount());
            ps.setDate(4,new java.sql.Date(incomeRecorder.getDate().getTime()));

            ps.execute();
            isAdd=true;
        } catch (SQLException e) {
            e.printStackTrace();
            isAdd=false;
        }
        return isAdd;
    }
}
