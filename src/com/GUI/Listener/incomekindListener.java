package com.GUI.Listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.Entity.Income;
import com.GUI.Panel.manageIncomeKindPanel;
import com.Service.IncomeService;

public class incomekindListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            manageIncomeKindPanel  p = manageIncomeKindPanel.INSTANCE;//获取收入分类工作面板的单例对象
            JButton b = (JButton) e.getSource(); //判断事件来源

           if (b == p.bAdd) {
               System.out.println("添加");
               String id = JOptionPane.showInputDialog("收入分类ID");
               if (0 == id.length()) {
                   JOptionPane.showMessageDialog(p, "ID不能为空", "警告", JOptionPane.WARNING_MESSAGE);
               }
               else {
                     String name = JOptionPane.showInputDialog("收入分类名称");
                     if (0 == name.length())
                       JOptionPane.showMessageDialog(p, "分类不能为空", "警告", JOptionPane.WARNING_MESSAGE);
                     else {
                          if (!new IncomeService().addIncome(id, name))
                             JOptionPane.showMessageDialog(p, "不能添加已存在的项目", "警告", JOptionPane.WARNING_MESSAGE);
                   }
               }
           }


            if (b == p.bEdit) {
                System.out.println("修改");
                Income income = p.getSelectedCategory();
                String id=income.getIncomeID();
                String name = JOptionPane.showInputDialog("新名称",income.getIncomeName());
                  if(0==name.length()){
                      JOptionPane.showMessageDialog(p, "新名称不能为空", "警告", JOptionPane.WARNING_MESSAGE);

                  }
                    else {
                         new IncomeService().updateIncome(id,name);
                  }
            }




            if (b == p.bDelete) {
                System.out.println("删除");

          }

    }


}
