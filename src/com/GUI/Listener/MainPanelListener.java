package com.GUI.Listener;


import com.GUI.Panel.AddPersonInforPanel;
import com.GUI.Panel.MainPanel;
import com.GUI.Panel.ResetPanels;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanelListener  implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        MainPanel m = MainPanel.INSTANCE;
        if( menuItem == m.addPersonalInfor) //跳转到添加个人信息功能页面
        ((ResetPanels)m.workingPanel).show(AddPersonInforPanel.INSTANCE);
    }
}
