package com.GUI.Panel;
import java.awt.*;
import javax.swing.*;

import com.Entity.Income;
import com.tools.guiUtils;
import com.GUI.Models.IncomTables;
import com.Service.IncomeService;
import com.GUI.Listener.incomekindListener;
public class manageIncomeKindPanel extends WorkingPanel { //收入分类管理工作面板

    static {
        guiUtils.SetUI();
    }

    public static manageIncomeKindPanel INSTANCE = new manageIncomeKindPanel();


    public JButton bAdd = new JButton("新增");
    public JButton bEdit = new JButton("修改");
    public JButton bDelete = new JButton("删除");
 //   String columNames[] = new String[]{"分类名称", "消费次数"};

    public IncomTables incomTables = new IncomTables();//JTables模型用于管理JTables的数据

    public JTable table = new JTable(incomTables);//用模型去注册表格

    private manageIncomeKindPanel() {


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


    public Income getSelectedCategory() {//返回模型列表中的某个Income对象
        int index = table.getSelectedRow();
        return incomTables.cs.get(index);
    }

     @Override
    public void updateData() {
        incomTables.cs = new IncomeService().list();
        table.updateUI();
        table.getSelectionModel().setSelectionInterval(0, 0);

        if(0==incomTables.cs.size()){ //如果行列的值为0则不允许编辑和删除
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

