package com.GUI.Panel;

import javax.swing.*;

public class AddPersonInforPanel extends JPanel {

    public  static AddPersonInforPanel INSTANCE = new AddPersonInforPanel();

    public  JLabel nameLable = new JLabel("姓名");
    public  JLabel emailLable = new JLabel("邮箱");
    public  JLabel sexLable = new JLabel("性别");
    public  JLabel jobLable = new JLabel("职业");

    public JTextField  nameTextField = new JTextField();
    public JTextField  emailTextField = new JTextField();
    public JTextField  sexTextField = new JTextField();
    public JTextField  jobTextField = new JTextField();

    private AddPersonInforPanel(){
        

    }







}
