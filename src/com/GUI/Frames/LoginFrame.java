package com.GUI.Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.GUI.Panel.MainPanel;
import com.Service.UserService;
import com.tools.MD5Utils;
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

    public LoginFrame() {

        setTitle("登录");
        Container container = getContentPane();

        setResizable(false);
        setSize(500, 400);
        setLayout(null);
        setLocationRelativeTo(null);//主窗口居中显示

        titleLable.setText("家庭财务管理系统");
        titleLable.setFont(guiUtils.getFont("宋体",25));//com.tools.guiUtils

        idLable.setText("账号");
        passwordLable.setText("密码");
        loginButton.setText("登录");
        registerButton.setText("注册");

        titleLable.setBounds(150, 50, 250, 50);
        idLable.setBounds(50, 120, 60, 50);
        passwordLable.setBounds(50, 170, 60, 50);

        idTextFilede.setBounds(150, 130, 250, 40);
        inputPasswordLable.setBounds(150, 180, 250, 40);

        loginButton.setBounds(140, 250, 70, 50);
        registerButton.setBounds(270, 250, 70, 50);

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


    private void addListener() {
        LoginFrameRBListener loginFrameRBListener = new LoginFrameRBListener();
        LoginButtonListener loginButtonListener = new LoginButtonListener();
        registerButton.addActionListener(loginFrameRBListener);
        loginButton.addActionListener(loginButtonListener);

    }


    //监听器
    class LoginFrameRBListener implements ActionListener { //注册按钮监听器

        @Override
        public void actionPerformed(ActionEvent e) {

            new RegisterFrame();//打开注册界面
            dispose();//关闭本窗口

        }


    }

    class LoginButtonListener implements ActionListener { //登录按钮监听器
        @Override
        public void actionPerformed(ActionEvent e) {
            String id = idTextFilede.getText();
            String password = new String(inputPasswordLable.getPassword());
            String MD5 = MD5Utils.toMd5(password);
            if (id.equals(" ") || password.equals(""))
                new JOptionPane().showMessageDialog(null, "用户名或密码不能为空"
                        , "警告", JOptionPane.WARNING_MESSAGE);

            else {

                if (new UserService().UserLogin(id,MD5)) {
                    new MainFrame();//跳转到主功能页面
                    MainPanel.whologin = id; //保存登录者ID
                    dispose();//关闭登录页面
                }

                else
                    new JOptionPane().showMessageDialog(null, "用户名或密码错误"
                            , "警告", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

   public  static  void main(String[] args)
   {
       new LoginFrame();

   }
}
