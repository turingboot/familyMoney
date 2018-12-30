package com.GUI.Listener;

import com.Entity.Consume;

import com.GUI.Panel.manageConsumeKindPanel;
import com.Service.IncomeService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.Service.ConsumeService;

public class consumeKindListener implements ActionListener

{


    @Override
    public void actionPerformed(ActionEvent e) {
        manageConsumeKindPanel p = manageConsumeKindPanel.INSTANCE;//获取收入分类工作面板的单例对象
        JButton b = (JButton) e.getSource(); //判断事件来源

        if (b == p.bAdd) {
            System.out.println("添加");
            String id = JOptionPane.showInputDialog("消费分类ID");
            if (0 == id.length()) {
                JOptionPane.showMessageDialog(p, "ID不能为空", "警告", JOptionPane.WARNING_MESSAGE);
            }
            else {
                String name = JOptionPane.showInputDialog("消费分类名称");
                if (0 == name.length())
                    JOptionPane.showMessageDialog(p, "分类不能为空", "警告", JOptionPane.WARNING_MESSAGE);
                else {
                    if (!new ConsumeService().addConsume(id,name))
                        JOptionPane.showMessageDialog(p, "不能添加已存在的项目", "警告", JOptionPane.WARNING_MESSAGE);
                }
            }
        }


        if (b == p.bEdit) {
            System.out.println("修改");
            Consume consume = p.getSelectedCategory();//获取鼠标选中的列
            String id=consume.getConsumeID();
            String name = JOptionPane.showInputDialog("新名称",consume.getConsumeName());
            if(0==name.length()){
                JOptionPane.showMessageDialog(p, "新名称不能为空", "警告", JOptionPane.WARNING_MESSAGE);

            }
            else {
                new ConsumeService().updateConsume(id,name);
            }
        }




        if (b == p.bDelete) {
            System.out.println("删除");

        }

    }

}
