package com.DAO;

import com.Entity.Income;
import com.tools.JDBCUtils;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;
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

}
