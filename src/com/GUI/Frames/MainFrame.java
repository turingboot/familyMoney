package com.GUI.Frames;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import com.tools.guiUtils;

public class MainFrame extends JFrame {
     static {
         guiUtils.SetUI();
     }
  //   public static MainFrame INSTANCE = new MainFrame();

     public   JMenuBar jMenuBar = new JMenuBar();
     public   JMenu managePersonInforMenu = new JMenu("个人信息管理(Q)");//菜单栏
     public  JMenu manageIncomeKindMenu = new JMenu("收入分类管理(W)");
     public   JMenu manageConsumeKindMenu = new JMenu("支出分类管理(E)");
     public   JMenu manageIncomeMenu = new JMenu("收入管理(R)");
     public   JMenu manageConsumeMenu = new JMenu("支出管理(T)");
     public   JMenu incomeAndcomsumeViewMenu = new JMenu("财务状况(Y)");

     public   JMenuItem addPersonalInfor = new JMenuItem("添加信息");//子菜单
     public  JMenuItem modifyPersonalInfor = new JMenuItem("修改信息");

     public   JMenuItem addIncomeKind = new JMenuItem("添加收入分类");//
     public   JMenuItem modifyIncomeKind = new JMenuItem("修改收入分类");
     public   JMenuItem deleteIncomeKind = new JMenuItem("删除收入分类");

     public   JMenuItem addConsumeKind = new JMenuItem("添加支出分类");//
     public  JMenuItem modifyConsumeKind = new JMenuItem("修改支出分类");
     public   JMenuItem deleteConsumeKinds = new JMenuItem("删除支出分类");
//
//     public  final JMenuItem addIncome = new JMenuItem("添加收入");
//     public  final JMenuItem modifyIncome = new JMenuItem("");
//     public  final JMenuItem deletIncome = new JMenuItem("");
//
//     public  final JMenuItem addConsume = new JMenuItem();
//     public  final JMenuItem modifyConsume = new JMenuItem();
//     public  final JMenuItem deletConsume = new JMenuItem();
//
//    public JPanel jPanel = new JPanel();
//
//    public JButton j = new JButton("22222");


  public  MainFrame(){
        setTitle("");
        setBounds(100,100,700,475);
        setResizable(false);//设置窗口大小不可变
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         DesignJmenuBar();
//         jPanel.add(j);
//         getContentPane().add(jPanel,"Center");

    }


    private void DesignJmenuBar(){
        setJMenuBar(jMenuBar);
        jMenuBar.setPreferredSize(new Dimension(500, 50));
        jMenuBar.add(managePersonInforMenu); //设置各个菜单项目
        jMenuBar.add(manageIncomeKindMenu);
        jMenuBar.add(manageConsumeKindMenu);
        jMenuBar.add(manageIncomeMenu);
        jMenuBar.add(manageConsumeMenu);
        jMenuBar.add(incomeAndcomsumeViewMenu);

        managePersonInforMenu.setMnemonic(KeyEvent.VK_Q);//设置菜单快捷键
        manageIncomeKindMenu.setMnemonic(KeyEvent.VK_W);
        manageConsumeKindMenu.setMnemonic(KeyEvent.VK_E);
        manageIncomeMenu.setMnemonic(KeyEvent.VK_R);
        manageConsumeMenu.setMnemonic(KeyEvent.VK_T);
        incomeAndcomsumeViewMenu.setMnemonic(KeyEvent.VK_Y);


        //个人信息管理菜单项子菜单
        managePersonInforMenu.add(addPersonalInfor);
        addPersonalInfor.setPreferredSize(new Dimension(95,30));//调整子菜单项的大小
        managePersonInforMenu.add(modifyPersonalInfor);
        modifyPersonalInfor.setPreferredSize(new Dimension(95,30));


        //收入分类管理子菜单

        manageIncomeKindMenu.add(addIncomeKind);
        manageIncomeKindMenu.add(modifyIncomeKind);
        manageIncomeKindMenu.add(deleteIncomeKind);

        //消费分类管理子菜单
        manageConsumeKindMenu.add(addConsumeKind);
        manageConsumeKindMenu.add(modifyConsumeKind);
        manageConsumeKindMenu.add(deleteConsumeKinds);

        //添加收入





        //添加支出







    }

    public static void main(String[] args){

     //   MainFrame mainFrame = MainFrame.INSTANCE;

    }

}
