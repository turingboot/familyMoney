package com.DAO;

import com.Entity.Income;
import com.tools.JDBCUtils;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;

import static com.tools.MD5Utils.toMd5;

public class IncomeDAO {

    public List<Income> list() {
        List<Income> incomes = new ArrayList<Income>();

        String sql = "select * from income ";//选出所有分类

        try (Connection c = JDBCUtils.getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Income income = new Income();
                String id = rs.getString("incomeID");
                String name = rs.getString("incomeName");
                income.setIncomeID(id);
                income.setIncomeName(name);
                incomes.add(income);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return incomes;
    }


    public  boolean add(Income income){
        boolean isAdd = false;
        String sql = "INSERT INTO income(incomeID,incomeName)  VALUES(?,?)";
        try (Connection c = JDBCUtils.getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
            ps.setString(1, income.getIncomeID());
            ps.setString(2, income.getIncomeName());
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
        String sql = String.format("UPDATE income SET incomeName = ? WHERE incomeID = %s",id);
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
        String sql = String.format("SELECT %s FROM income WHERE incomeName = '%s' ",sign,name);
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
