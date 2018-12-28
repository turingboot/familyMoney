package com.GUI.Listener;




import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.GUI.Panel.updatePersonInforPanel;
import com.GUI.Panel.MainPanel;
import com.GUI.Panel.ResetPanel;
import com.GUI.Panel.updatePasswordPanel;
public class MainPanelListener  implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        MainPanel m = MainPanel.INSTANCE;
        if( menuItem == m.addPersonalInfor) //个人信息变更页面
        ((ResetPanel)m.workingPanel).show(updatePersonInforPanel.INSTANCE);

        if(menuItem == m.modifyPassword)//密码修改页面
        { System.out.println("1111");
            ((ResetPanel)m.workingPanel).show(updatePasswordPanel.INSTANCE);}


    }
}
