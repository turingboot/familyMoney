package com.GUI.Frames;
import com.Service.UserService;
import com.tools.guiUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterFrame extends  JFrame {

    static {
        guiUtils.SetUI();
    }


    public JLabel nameLable = new JLabel();
    public JLabel idLable = new JLabel();
    public JLabel passwordLable = new JLabel();
    public JTextField nameTextFiled = new JTextField();
    public JTextField idTextFilede = new JTextField();
    public JPasswordField inputPasswordLable = new JPasswordField();
    public JButton registerButton = new JButton();
    public JButton backTologinButton = new JButton();

    public RegisterFrame() {

        setTitle("欢迎注册");
        Container container = getContentPane();

        setResizable(false);
        setSize(500, 400);
        setLocationRelativeTo(null);//主窗口居中显示
        setLayout(null);

        nameLable.setText("用户名");
        idLable.setText("账号");
        passwordLable.setText("密码");
        registerButton.setText("注册");
        backTologinButton.setText("返回登录页面");

        nameLable.setBounds(50, 70, 60, 50);
        idLable.setBounds(50, 120, 60, 50);
        passwordLable.setBounds(50, 170, 60, 50);

        nameTextFiled.setBounds(150, 80, 250, 40);
        idTextFilede.setBounds(150, 130, 250, 40);
        inputPasswordLable.setBounds(150, 180, 250, 40);

        registerButton.setBounds(140, 250, 70, 50);
        backTologinButton.setBounds(240, 250, 130, 50);
        container.add(nameLable);
        container.add(idLable);
        container.add(passwordLable);

        container.add(nameTextFiled);
        container.add(idTextFilede);
        container.add(inputPasswordLable);
        container.add(registerButton);
        container.add(backTologinButton);
        addListener();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }


    public void addListener() {
        RegisterCommitListener registerListener = new RegisterCommitListener();
        BackToLoginListener backToLoginListener = new BackToLoginListener();

        registerButton.addActionListener(registerListener);
        backTologinButton.addActionListener(backToLoginListener);
    }

    public static void main(String[] args) {

        new RegisterFrame();


    }


    //监听器内部类
    public class BackToLoginListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new LoginFrame();
            dispose();//关闭本注册窗口
        }

    }


    public class RegisterCommitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String name = nameTextFiled.getText();
            String id = idTextFilede.getText();
            String password = new String(inputPasswordLable.getPassword());
            int grade = 1;




                if (name.length() > 12 || id.length() > 10 || password.length() > 16)
                { new JOptionPane().showMessageDialog(null, "用户名不超过12位,账户不超过10位,密码不超过16位"
                            , "警告", JOptionPane.WARNING_MESSAGE);}
             else  if (name.equals(" ") || id.equals("") || password.equals(""))
                {  new JOptionPane().showMessageDialog(null, "所有项目不能为空，请重新填写"
                            , "警告", JOptionPane.WARNING_MESSAGE);}
                else {
                 new UserService().UserRegister(id, name, password, grade);
                 new JOptionPane().showMessageDialog(null, "注册成功,确认后自动跳转到登录页面"
                         , "恭喜注册成功", JOptionPane.INFORMATION_MESSAGE);
                 dispose();//关闭注册页面，
                 new LoginFrame(); //自动跳转到登录页面

                } }
      }
}













