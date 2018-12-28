package com.GUI.Panel;

import com.Service.UserService;

import javax.swing.*;
import java.awt.*;
import com.GUI.Listener.updateInforListener;
public class updatePersonInforPanel extends WorkingPanel {

    public  static updatePersonInforPanel INSTANCE = new updatePersonInforPanel();

    public  JLabel nameLable = new JLabel("用户名");
    public  JLabel emailLable = new JLabel("邮箱");
    public  JLabel sexLable = new JLabel("性别");
    public  JLabel jobLable = new JLabel("职业");

    public JTextField  nameTextField = new JTextField();
    public JTextField  emailTextField = new JTextField();
    public JTextField  sexTextField = new JTextField();
    public JTextField  jobTextField = new JTextField();

    public JButton updatePersonalInforButton = new JButton("提交修改");

    private updatePersonInforPanel(){

        setLayout(new BorderLayout());
        this.add(NorthJPanel(),BorderLayout.CENTER);
        JPanel pButton = new JPanel();

        pButton.add(updatePersonalInforButton);
        this.add(pButton,BorderLayout.SOUTH);
        addListener();

    }

    private JPanel NorthJPanel(){
         JPanel jPanel = new JPanel();
         jPanel.setLayout(new GridLayout(4,2,40,40));
         jPanel.add(nameLable);
         jPanel.add(nameTextField);

         if((null!=MainPanel.INSTANCE)&&(!MainPanel.whologin.equals("")))
         { String name = new UserService().getExitsName(MainPanel.whologin);//获取当前登录者的部分信息
          nameTextField.setText(name);}

         jPanel.add(emailLable);
         jPanel.add(emailTextField);
         jPanel.add(sexLable);
         jPanel.add(sexTextField);
         jPanel.add(jobLable);
         jPanel.add(jobTextField);
         return jPanel;
    }

    public void addListener(){
        updateInforListener Listener = new updateInforListener();
        updatePersonalInforButton.addActionListener(Listener);

    }

    @Override
    public void updateData() {

    }
}
