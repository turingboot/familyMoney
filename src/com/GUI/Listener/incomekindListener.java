package com.GUI.Listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import com.GUI.Panel.manageIncomeKindPanel;
public class incomekindListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            manageIncomeKindPanel  p = manageIncomeKindPanel.INSTANCE;//获取工作面板
            JButton b = (JButton) e.getSource(); //判断事件来源

           if (b == p.bAdd) {
               System.out.println("添加");

                }

            if (b == p.bEdit) {
                System.out.println("修改");
            }

            if (b == p.bDelete) {
                System.out.println("删除");

          }

    }


}
