package com.GUI.Frames;



import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import com.tools.guiUtils;
public class MainFrame extends JFrame {
     static {
         guiUtils.SetUI();
     }
     public static MainFrame INSTANCE = new MainFrame();

     public  final JMenuBar jMenuBar = new JMenuBar();
     public  final JMenu managePersonInforMenu = new JMenu("个人信息管理(Q)");
     public  final JMenu manageIncomeKindMenu = new JMenu("收入分类管理(W)");
     public  final JMenu manageConsumeKindMenu = new JMenu("支出分类管理(E)");
     public  final JMenu manageIncomeMenu = new JMenu("收入管理(R)");
     public  final JMenu manageConsumeMenu = new JMenu("支出管理(T)");

     public  final JMenuItem addPersonalInfor = new JMenuItem("添加信息");
    public  final JMenuItem modifyPersonalInfor = new JMenuItem("修改信息");


  private  MainFrame(){
        setTitle("");
        setBounds(100,100,700,475);
        setResizable(false);//设置窗口大小不可变
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         DesignJmenuBar();



    }




    private void DesignJmenuBar(){

        setJMenuBar(jMenuBar);
        jMenuBar.setPreferredSize(new Dimension(500, 50));
        jMenuBar.add(managePersonInforMenu); //设置各个菜单项目
        jMenuBar.add(manageIncomeKindMenu);
        jMenuBar.add(manageConsumeKindMenu);
        jMenuBar.add(manageIncomeMenu);
        jMenuBar.add(manageConsumeMenu);

        managePersonInforMenu.setMnemonic(KeyEvent.VK_Q);//设置菜单快捷键
        manageIncomeKindMenu.setMnemonic(KeyEvent.VK_W);
        manageConsumeKindMenu.setMnemonic(KeyEvent.VK_E);
        manageIncomeMenu.setMnemonic(KeyEvent.VK_R);
        manageConsumeMenu.setMnemonic(KeyEvent.VK_T);

        managePersonInforMenu.add(addPersonalInfor);
        addPersonalInfor.setPreferredSize(new Dimension(95,40));//调整子菜单项的大小
        managePersonInforMenu.add(modifyPersonalInfor);
        modifyPersonalInfor.setPreferredSize(new Dimension(95,40));





//
//        menuJpanel.add(jMenuBar);
//        menuJpanel.setLayout(new BorderLayout());
//        menuJpanel.setBounds(10,10,300,60);
//        getContentPane().add(menuJpanel,BorderLayout.NORTH);






    }

    public static void main(String[] args){

      MainFrame mainFrame = MainFrame.INSTANCE;

    }

}
