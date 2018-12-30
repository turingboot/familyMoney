package com.GUI.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.GUI.Panel.MainPanel;
import com.GUI.Panel.ResetPanel;
import com.GUI.Panel.setIncomePanel;
import com.GUI.Panel.manageIncomeKindPanel;
import com.Service.IncomeRecorderService;

import javax.swing.*;

public class setIncomeListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        setIncomePanel set = setIncomePanel.INSTANCE;
        if(0==set.incomeComBoxModel.ItemList.size())
        {
            new JOptionPane().showMessageDialog(set, "收入分类为空，没有添加根据，请添加！！！"
                    , "警告", JOptionPane.WARNING_MESSAGE);
            ((ResetPanel) MainPanel.INSTANCE.workingPanel).show(manageIncomeKindPanel.INSTANCE);//没有收入分类不能添加
            return;
        }
        if(0==set.inName.getText().length()){
            new JOptionPane().showMessageDialog(set, "收入者不能为空！！！"
                    , "警告", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(0==set.inAmount.getText().length()){
            new JOptionPane().showMessageDialog(set, "金额不能为空！！！"
                    , "警告", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double cost = Double.parseDouble(set.inAmount.getText());
        String name = set.inName.getText();
        String IncomeName = set.getSelectedIncome();
        Date date = set.datePicker.getDate();
        if(new IncomeRecorderService().addIncomeRecorder(name,IncomeName,cost,date))
        new JOptionPane().showMessageDialog(set, "记录成功"
                , "成功", JOptionPane.INFORMATION_MESSAGE);

    }
}
