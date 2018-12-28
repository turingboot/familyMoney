package com.GUI.Panel;

import javax.swing.*;
import java.awt.*;
import com.GUI.Listener.updatePswListener;
public class updatePasswordPanel extends WorkingPanel {


    public  static  updatePasswordPanel INSTANCE = new updatePasswordPanel();
    public JLabel inputPasswordLable = new JLabel("新密码");
    public JLabel inputPasswordAgainLable = new JLabel("再次输入");
    public JPasswordField inputTextField = new JPasswordField();
    public JPasswordField inputAgainTextFiled = new JPasswordField();

    public JButton pButton = new JButton("确认");

    private updatePasswordPanel(){
         setLayout(new BorderLayout());
         JPanel pPanel = new JPanel();
          pPanel.add(pButton);
          pButton.setPreferredSize(new Dimension(60,30));
         this.add(pswPanel(),BorderLayout.CENTER);
         this.add(pPanel,BorderLayout.SOUTH);
         addListener();



    }

    private JPanel pswPanel(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(5,2,25,25));
        jPanel.add(inputPasswordLable);
        jPanel.add(inputTextField);
        jPanel.add(inputPasswordAgainLable);
        jPanel.add(inputAgainTextFiled);
        return jPanel;
    }

    public boolean compareText(){
        if(new String(inputTextField.getPassword()).equals(inputAgainTextFiled.getPassword()))
                  return true;
        else
             return false;
    }





    @Override
    public void addListener() {
        updatePswListener listener = new updatePswListener();
        pButton.addActionListener(listener);

    }

    @Override
    public void updateData() {

    }
}
