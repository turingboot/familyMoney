package com.GUI.Models;

import com.Entity.Consume;
import com.Service.ConsumeService;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ConsumeTables  extends AbstractTableModel {

    String[] columnNames = new String[] { "消费分类ID", "消费名称"};

    // 使用从Service返回的List作为TableModel的数据

    public List<Consume> cs = new ConsumeService().list();

    public int getRowCount() {//计算行数

        return cs.size();
    }

    public int getColumnCount() { //计算列数

        return columnNames.length;
    }

    public String getColumnName(int columnIndex) {//获取每一列的名称

        return columnNames[columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) //设置单元的编辑状态
    {  //  if(rowIndex)
        return false;
    }

    // 先通过cs.get(rowIndex)获取行对应的对象
    // 然后根据columnIndex返回对应的属性
    public Object getValueAt(int rowIndex, int columnIndex) {
        Consume h = cs.get(rowIndex);
        if (0 == columnIndex)
            return h.getConsumeID();
        if (1 == columnIndex)
            return h.getConsumeName();

        return h;
    }

}
