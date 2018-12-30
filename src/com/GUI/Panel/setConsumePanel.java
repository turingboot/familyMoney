package com.GUI.Panel;


import com.GUI.Models.ConsumeComBoxModel;
import com.Service.ConsumeService;
import com.Service.UserService;
import com.tools.guiUtils;
import org.jdesktop.swingx.JXDatePicker;
import com.GUI.Listener.setConsumeListener;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class setConsumePanel extends WorkingPanel {

    {
        guiUtils.SetUI();
    }
    public static setConsumePanel INSTANCE = new setConsumePanel();

    public JLabel name =  new JLabel("消费者");
    public JLabel resource = new JLabel("去向");
    public JLabel amount = new JLabel("金额");
    public JLabel date = new JLabel("日期");
    public JTextField inName = new JTextField();
    public JTextField inAmount = new JTextField();
    public ConsumeComBoxModel consumeComBoxModel = new ConsumeComBoxModel();
    public JComboBox<String> consumeComBox = new JComboBox<String>(consumeComBoxModel);
    public JXDatePicker datePicker = new JXDatePicker( new Date());

    public JButton pButton = new JButton("提交");

    private setConsumePanel(){
        setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();//装提交按钮的工作面板
        jPanel.add(pButton,BorderLayout.SOUTH);
        pButton.setPreferredSize(new Dimension(50,30));
        this.add(setN(),BorderLayout.NORTH);
        this.add(jPanel,BorderLayout.CENTER);
        addListener();

    }

    private JPanel setN(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(4,2,50,50));
        jPanel.add(name);
        jPanel.add(inName);
        jPanel.add(resource);
        jPanel.add(consumeComBox);
        jPanel.add(date);
        jPanel.add(datePicker);
        jPanel.add(amount);
        jPanel.add(inAmount);
        return jPanel;
    }


    @Override
    public void addListener() {
      setConsumeListener listener =new setConsumeListener();
      pButton.addActionListener(listener);
    }

    @Override
    public void updateData() {


        consumeComBox.updateUI();
        ResetUI();
      //  inAmount.grabFocus();//获得光标
    }
    public String getSelectedIncome() {//返回模型列表中的某个Income对象
        int index = consumeComBox.getSelectedIndex();
        return consumeComBoxModel.ItemList.get(index);
    }

    private void ResetUI(){

        if((null!=MainPanel.INSTANCE)&&(!MainPanel.whologin.equals("")))
        { String name = new UserService().getExitsName(MainPanel.whologin);//获取当前登录者的部分信息
            inName.setText(name);}

      inAmount.setText("0");
        consumeComBoxModel.ItemList=new ConsumeService().listName();//刷新组合框数据列表
        if(0!=consumeComBoxModel.ItemList.size())
            consumeComBox.setSelectedIndex(0);
        datePicker.setDate(new Date());

    }
}
