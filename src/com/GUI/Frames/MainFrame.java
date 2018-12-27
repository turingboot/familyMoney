package com.GUI.Frames;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

import com.GUI.Panel.MainPanel;
import com.tools.guiUtils;
import sun.applet.Main;

public class MainFrame extends JFrame {

    public MainFrame(){
        setTitle("家庭财务管理系统");
        setSize(500,450);
        setVisible(true);//设置为可见窗口
        setLocationRelativeTo(null);//主窗口居中显示
        setContentPane(MainPanel.INSTANCE);//将主Panel窗口设置为内容窗口
        setResizable(false);//窗口不可最大化
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗口关闭方式

    }

    public static  void  main(String[] args){
        MainFrame mainFrame = new MainFrame();

    }

}
