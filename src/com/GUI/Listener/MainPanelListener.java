package com.GUI.Listener;




import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.GUI.Panel.*;
public class MainPanelListener  implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        MainPanel m = MainPanel.INSTANCE;
        if (menuItem == m.addPersonalInfor) //个人信息变更页面
        {
            ((ResetPanel) m.workingPanel).show(updatePersonInforPanel.INSTANCE);
        }
        if (menuItem == m.modifyPassword)//密码修改页面
        {
            System.out.println("已经进入密码修改页面");
            ((ResetPanel) m.workingPanel).show(updatePasswordPanel.INSTANCE);
        }


        if (menuItem == m.manageIncome) {
            System.out.println("已经进入收入分类管理页面");//收入分类管理面板
            ((ResetPanel) m.workingPanel).show(manageIncomeKindPanel.INSTANCE);
        }

        if (menuItem == m.manageConsume) {
            System.out.println("已经进入消费分类管理页面");//消费分类管理面板
            ((ResetPanel) m.workingPanel).show(manageConsumeKindPanel.INSTANCE);
        }
    }
}

