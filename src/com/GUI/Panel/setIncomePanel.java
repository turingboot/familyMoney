package com.GUI.Panel;


import javax.swing.*;
import java.awt.*;
import java.util.Date;
import com.GUI.Models.IncomeComBoxModel;
import com.Service.IncomeService;
import com.Service.UserService;
import com.tools.guiUtils;
import com.GUI.Listener.setIncomeListener;
import org.jdesktop.swingx.JXDatePicker;

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
    public  JXDatePicker datePicker = new JXDatePicker( new Date());

    public JButton pButton = new JButton("提交");

    private setIncomePanel(){
        setLayout(new BorderLayout());

        JPanel jPanel = new JPanel();

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
        jPanel.add(incomeComBox);
        jPanel.add(date);
        jPanel.add(datePicker);
        jPanel.add(amount);
        jPanel.add(inAmount);

        return jPanel;
    }


    @Override
    public void addListener() {
        setIncomeListener listener = new setIncomeListener();
        pButton.addActionListener(listener);

    }

    @Override
    public void updateData() {
        incomeComBox.updateUI();
        ResetUI();
    }

    public String getSelectedIncome() {//返回模型列表中的某个Income对象
        int index = incomeComBox.getSelectedIndex();
        return incomeComBoxModel.ItemList.get(index);
    }
    private void ResetUI(){

        if((null!=MainPanel.INSTANCE)&&(!MainPanel.whologin.equals("")))
        { String name = new UserService().getExitsName(MainPanel.whologin);//获取当前登录者的部分信息
            inName.setText(name);}
        inAmount.setText("0");
        incomeComBoxModel.ItemList=new IncomeService().listName();//刷新组合框数据列表
        if(0!=incomeComBoxModel.ItemList.size())
            incomeComBox.setSelectedIndex(0);
        datePicker.setDate(new Date());

    }
}
