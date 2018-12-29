package com.GUI.Panel;

import com.GUI.Models.IncomeComBoxModel;
import com.Service.IncomeService;
import com.tools.guiUtils;
import org.jdesktop.swingx.JXDatePicker;
import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class setIncomePanel extends WorkingPanel {


    {
        guiUtils.SetUI();
    }
    public static setIncomePanel INSTANCE = new setIncomePanel();

    public JLabel name =  new JLabel("消费者");
    public JLabel resource = new JLabel("去向");
    public JLabel amount = new JLabel("金额");
    public JLabel date = new JLabel("日期");
    public JTextField inName = new JTextField();
    public JTextField inAmount = new JTextField();
    public IncomeComBoxModel incomeComBoxModel = new IncomeComBoxModel();
    public JComboBox<String> incomeComBox = new JComboBox<String>(incomeComBoxModel);
    final JXDatePicker datePicker = new JXDatePicker( new Date());

    public JButton pButton = new JButton("提交");

    private setIncomePanel(){
        setLayout(new BorderLayout());

        JPanel jPanel = new JPanel();

        jPanel.add(pButton,BorderLayout.SOUTH);
        pButton.setPreferredSize(new Dimension(50,30));
        this.add(setN(),BorderLayout.NORTH);
        this.add(jPanel,BorderLayout.CENTER);

    }

    private JPanel setN(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(4,2,50,50));
        jPanel.add(name);
        jPanel.add(inName);
        jPanel.add(resource);
        jPanel.add(incomeComBox);
        jPanel.add(date);
        jPanel.add(datePicker);
        jPanel.add(amount);
        jPanel.add(inAmount);

        return jPanel;
    }


    @Override
    public void addListener() {

    }

    @Override
    public void updateData() {
        incomeComBox.updateUI();
        ResetUI();
        //  inAmount.grabFocus();//获得光标
    }


    private void ResetUI(){
        inAmount.setText("0");
        incomeComBoxModel.ItemList=new IncomeService().listName();//刷新组合框数据列表
        if(0!=incomeComBoxModel.ItemList.size())
            incomeComBox.setSelectedIndex(0);
        datePicker.setDate(new Date());

    }
}
