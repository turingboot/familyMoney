package com.GUI.Listener;

import com.GUI.Panel.MainPanel;
import com.GUI.Panel.ResetPanel;
import com.GUI.Panel.manageConsumeKindPanel;
import com.GUI.Panel.setConsumePanel;
import com.Service.ConsumeRecoderService;
import com.Service.ConsumeService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class setConsumeListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        setConsumePanel set = setConsumePanel.INSTANCE;
        if(0==set.consumeComBoxModel.ItemList.size())
        {
            new JOptionPane().showMessageDialog(set, "消费分类为空，没有添加根据，请添加！！！"
                    , "警告", JOptionPane.WARNING_MESSAGE);
            ((ResetPanel) MainPanel.INSTANCE.workingPanel).show(manageConsumeKindPanel.INSTANCE);//没有收入分类不能添加
            return;
        }
        if(0==set.inName.getText().length()){
            new JOptionPane().showMessageDialog(set, "消费者不能为空！！！"
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
        if(new ConsumeRecoderService().addConsumeRecorder(name,IncomeName,cost,date))
            new JOptionPane().showMessageDialog(set, "记录成功"
                    , "成功", JOptionPane.INFORMATION_MESSAGE);

    }
    }

