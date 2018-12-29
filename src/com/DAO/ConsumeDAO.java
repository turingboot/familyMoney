package com.DAO;

import com.Entity.Consume;
import com.tools.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

}
