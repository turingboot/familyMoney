package com.GUI.Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.tools.guiUtils;


public  class LoginFrame extends JFrame {
    static {
        guiUtils.SetUI();
    }


    public JLabel titleLable = new JLabel();
    public JLabel idLable = new JLabel();
    public JLabel passwordLable = new JLabel();
    public JPasswordField inputPasswordLable = new JPasswordField();
    public JTextField idTextFilede = new JTextField();
    public JButton loginButton = new JButton();
    public JButton registerButton = new JButton();



     public  LoginFrame(){

        setTitle("登录");
        Container container = getContentPane();

        setResizable(false);
        setBounds(600,200,500,400);
        setLayout(null);

        Font font = new Font("宋体",Font.BOLD,25) ;
        titleLable.setText("家庭财务管理系统");
        titleLable.setFont(font);

        idLable.setText("账号");
        passwordLable.setText("密码");
        loginButton.setText("登录");
        registerButton.setText("注册");

        titleLable.setBounds(150,50,250,50);
        idLable.setBounds(50,120,60,50);
        passwordLable.setBounds(50,170,60,50);

        idTextFilede.setBounds(150,130,250,40);
        inputPasswordLable.setBounds(150,180,250,40);

        loginButton.setBounds(140,250,70,50);
        registerButton.setBounds(270,250,70,50);

        container.add(titleLable);
        container.add(idLable);
        container.add(idTextFilede);
        container.add(passwordLable);
        container.add(inputPasswordLable);
        container.add(loginButton);
        container.add(registerButton);

        addListener();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    private  void addListener(){
         LoginFrameRBListener loginFrameRBListener = new LoginFrameRBListener();
         registerButton.addActionListener(loginFrameRBListener);

    }




     //监听器
     class LoginFrameRBListener  implements ActionListener { //注册按钮监听器

         @Override
         public void actionPerformed(ActionEvent e) {

            new RegisterFrame();//打开注册界面
             dispose();//关闭本窗口

         }


     }



     public  static void main(String[] args){
         new LoginFrame();

     }
}
