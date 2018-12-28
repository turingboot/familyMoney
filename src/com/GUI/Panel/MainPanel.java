package com.GUI.Panel;

import com.GUI.Listener.MainPanelListener;
import com.tools.guiUtils;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends WorkingPanel {
    static {
        guiUtils.SetUI();
      //  guiUtils.initAllPanels();

    }
    public static MainPanel INSTANCE = new MainPanel();
    public static String whologin ;

    public JMenuBar jMenuBar = new JMenuBar();
    public   JMenu managePersonInforMenu = new JMenu("个人信息管理");//菜单栏
    public   JMenu manageIncomeKindMenu = new JMenu("收入分类管理");
    public   JMenu manageConsumeKindMenu = new JMenu("支出分类管理");
    public   JMenu manageIncomeMenu = new JMenu("收入管理");
    public   JMenu manageConsumeMenu = new JMenu("支出管理");
    public   JMenu incomeAndcomsumeViewMenu = new JMenu("财务状况");

    public   JMenuItem addPersonalInfor = new JMenuItem("信息变更");//子菜单
    public   JMenuItem modifyPassword = new JMenuItem("修改密码");

    public   JMenuItem addIncomeKind = new JMenuItem("添加收入分类");//
    public   JMenuItem modifyIncomeKind = new JMenuItem("修改收入分类");
    public   JMenuItem deleteIncomeKind = new JMenuItem("删除收入分类");

    public   JMenuItem addConsumeKind = new JMenuItem("添加支出分类");//
    public   JMenuItem modifyConsumeKind = new JMenuItem("修改支出分类");
    public   JMenuItem deleteConsumeKinds = new JMenuItem("删除支出分类");

    public  static JPanel workingPanel ; //工作面板区



    public  MainPanel(){
        DesignJmenuBar();
        this.setLayout(new BorderLayout());
        workingPanel = new ResetPanel(0.8);

        this.add(jMenuBar,BorderLayout.NORTH);
        this.add(workingPanel,BorderLayout.CENTER);
        addListener();


    }

    private void DesignJmenuBar(){
        jMenuBar.setPreferredSize(new Dimension(-1, 50));
        jMenuBar.add(managePersonInforMenu); //设置各个菜单项目
        jMenuBar.add(manageIncomeKindMenu);
        jMenuBar.add(manageConsumeKindMenu);
        jMenuBar.add(manageIncomeMenu);
        jMenuBar.add(manageConsumeMenu);
        jMenuBar.add(incomeAndcomsumeViewMenu);


        //个人信息管理菜单项子菜单
        managePersonInforMenu.add(addPersonalInfor);
        addPersonalInfor.setPreferredSize(new Dimension(95,30));//调整子菜单项的大小
        managePersonInforMenu.add(modifyPassword);
        modifyPassword.setPreferredSize(new Dimension(95,30));


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



    @Override
    public void addListener() {
        MainPanelListener mainPanelListener = new MainPanelListener();
        addPersonalInfor.addActionListener(mainPanelListener);
        modifyPassword.addActionListener(mainPanelListener);

    }

}
