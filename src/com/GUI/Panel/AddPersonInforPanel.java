package com.GUI.Panel;

import javax.swing.*;
import java.awt.*;

public class AddPersonInforPanel extends WorkingPanel {

    public  static AddPersonInforPanel INSTANCE = new AddPersonInforPanel();

    public  JLabel nameLable = new JLabel("姓名");
    public  JLabel emailLable = new JLabel("邮箱");
    public  JLabel sexLable = new JLabel("性别");
    public  JLabel jobLable = new JLabel("职业");

    public JTextField  nameTextField = new JTextField();
    public JTextField  emailTextField = new JTextField();
    public JTextField  sexTextField = new JTextField();
    public JTextField  jobTextField = new JTextField();

    public JButton addPersonalInforButton = new JButton("提交修改");

    private AddPersonInforPanel(){
        setLayout(new BorderLayout());
        this.add(NorthJPanel(),BorderLayout.CENTER);
        JPanel pButton = new JPanel();
        pButton.add(addPersonalInforButton);
        this.add(pButton,BorderLayout.SOUTH);

    }

    private JPanel NorthJPanel(){
         JPanel jPanel = new JPanel();
         jPanel.setLayout(new GridLayout(4,2,40,40));
         jPanel.add(nameLable);
        // nameLable.setFont(guiUtils.getFont("宋体",10));
         jPanel.add(nameTextField);
         jPanel.add(emailLable);
         jPanel.add(emailTextField);
         jPanel.add(sexLable);
         jPanel.add(sexTextField);
         jPanel.add(jobLable);
         jPanel.add(jobTextField);
         return jPanel;
    }

    public void addListener(){};


}
