package com.GUI.Panel;

import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.Component;

/*
   用于将各个工作面板重绘组件大小的面板
 */
public class ResetPanel extends JPanel {

    private double rate;// 拉伸比例
    private JComponent c; // 显示的组件
    private boolean strech; // 是否拉伸

    public ResetPanel(double rate, boolean strech) {
        this.setLayout(null);
        this.rate = rate;
        this.strech = strech;
    }

    public ResetPanel(double rate) {
        this(rate, true);
    }

    public void repaint() { //重绘组件的大小
        if (null != c) {
            Dimension containerSize = this.getSize();
            Dimension componentSize = c.getPreferredSize();

            if (strech)
                c.setSize((int) (containerSize.width * rate), (int) (containerSize.height * rate));
            else
                c.setSize(componentSize);

            c.setLocation(containerSize.width / 2 - c.getSize().width / 2,
                    containerSize.height / 2 - c.getSize().height / 2);
        }
       super.repaint();
    }

    public void show(JComponent p) {
        this.c = p;
        Component[] cs = getComponents();
        for (Component c : cs) {
            remove(c);
        }

        if (p instanceof WorkingPanel) //属于WorkingPanel的子类都执行更新数据操作
            ((WorkingPanel) p).updateData();

        add(p);
        this.updateUI();
    }


}