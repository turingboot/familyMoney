package com.GUI.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.GUI.Panel.MainPanel;
import com.GUI.Panel.updatePersonInforPanel;
import com.Service.UserService;
import com.tools.guiUtils;

import javax.swing.*;

public class updateInforListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        updatePersonInforPanel u = updatePersonInforPanel.INSTANCE;
        String name = u.nameTextField.getText();
        String email = u.emailTextField.getText();
        String sex = u.sexTextField.getText();
        String job = u.jobTextField.getText();
        if (guiUtils.isNull(name) || guiUtils.isNull(email) || guiUtils.isNull(sex) || guiUtils.isNull(job))
            new JOptionPane().showMessageDialog(null, "任意字段不能为空"
                    , "警告", JOptionPane.WARNING_MESSAGE);
        else {
            if (new UserService().updateInfor(MainPanel.whologin, name, email, sex, job))

                new JOptionPane().showMessageDialog(null, "修改成功"
                        , "修改成功", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
