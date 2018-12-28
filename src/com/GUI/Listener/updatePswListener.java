package com.GUI.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.GUI.Panel.MainPanel;
import  com.GUI.Panel.updatePasswordPanel;
import com.Service.UserService;
import com.tools.guiUtils;

import javax.swing.*;

public class updatePswListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("11111");
        updatePasswordPanel u = updatePasswordPanel.INSTANCE;
        String psw1 = new String(u.inputTextField.getPassword());
        String psw2 = new String(u.inputAgainTextFiled.getPassword());

        if (guiUtils.isNull(psw1) || guiUtils.isNull(psw2))
            new JOptionPane().showMessageDialog(null, "任意字段不能为空"
                    , "警告", JOptionPane.WARNING_MESSAGE);
        else {
            if (!psw1.equals(psw2)) {
                new JOptionPane().showMessageDialog(null, "两次输入的密码不相同"
                        , "警告", JOptionPane.WARNING_MESSAGE);
            } else {
                if (new UserService().updatePSW(MainPanel.whologin, psw2))
                    new JOptionPane().showMessageDialog(null, "修改成功"
                            , "修改成功", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}
