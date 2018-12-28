package com.GUI.Panel;

import javax.swing.*;
import java.awt.*;

public class updatePasswordPanel extends WorkingPanel {


    public  static  updatePasswordPanel INSTANCE = new updatePasswordPanel();
    public JLabel inputPasswordLable = new JLabel("新密码");
    public JLabel inputPasswordAgainLable = new JLabel("再次输入");
    public JTextField inputTextField = new JTextField();
    public JTextField inputAgainTextFiled = new JTextField();

    public JButton pButton = new JButton("确认");

    private updatePasswordPanel(){
         setLayout(new BorderLayout());
         this.add(pswPanel(),BorderLayout.CENTER);
         this.add(pButton,BorderLayout.SOUTH);



    }

    private JPanel pswPanel(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(4,2,40,50));
        jPanel.add(inputPasswordLable);
        jPanel.add(inputPasswordAgainLable);
        jPanel.add(inputTextField);
        jPanel.add(inputAgainTextFiled);

        return jPanel;
    }

    public boolean compareText(){
        if(inputTextField.getText().equals(inputAgainTextFiled))
                  return true;
        else
             return false;
    }





    @Override
    public void addListener() {

    }
}
