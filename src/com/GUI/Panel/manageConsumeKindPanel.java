package com.GUI.Panel;

import com.Entity.Consume;
import com.Entity.Income;
import com.GUI.Listener.incomekindListener;
import com.GUI.Models.ConsumeTables;
import com.Service.ConsumeService;
import com.Service.IncomeService;
import com.tools.guiUtils;

import javax.swing.*;
import java.awt.*;

public class manageConsumeKindPanel extends WorkingPanel {
    static {
        guiUtils.SetUI();
    }

    public static manageConsumeKindPanel INSTANCE = new manageConsumeKindPanel();


    public JButton bAdd = new JButton("新增");
    public JButton bEdit = new JButton("修改");
    public JButton bDelete = new JButton("删除");


    public ConsumeTables consumeTables = new ConsumeTables();//JTables模型用于管理JTables的数据

    public JTable table = new JTable(consumeTables);//用模型去注册表格

    private manageConsumeKindPanel() {


        JScrollPane sp = new JScrollPane(table);//放表格的视图
        JPanel pSubmit = new JPanel();
        pSubmit.add(bAdd);//按钮放置在一个面板中
        pSubmit.add(bEdit);
        pSubmit.add(bDelete);

        this.setLayout(new BorderLayout());
        this.add(sp, BorderLayout.CENTER);//表格放置在该工作面板的北面
        this.add(pSubmit, BorderLayout.SOUTH);

        addListener();
    }


    public Consume getSelectedCategory() {//返回模型列表中的某个Income对象
        int index = table.getSelectedRow();
        return consumeTables.cs.get(index);
    }

    @Override
    public void updateData() {
        consumeTables.cs = new ConsumeService().list();
        table.updateUI();
        table.getSelectionModel().setSelectionInterval(0, 0);//选中一行

        if(0==consumeTables.cs.size()){//如果行列的值为0则不允许编辑和删除
            bEdit.setEnabled(false);
                      bDelete.setEnabled(false);
        }
        else{
            bEdit.setEnabled(true);
            bDelete.setEnabled(true);
        }

    }

    @Override
    public void addListener() {
        incomekindListener listener = new incomekindListener();
        bAdd.addActionListener(listener);
        bEdit.addActionListener(listener);
        bDelete.addActionListener(listener);

    }



}
