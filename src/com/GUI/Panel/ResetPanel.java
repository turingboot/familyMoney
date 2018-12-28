package com.GUI.Panel;

import java.awt.Dimension;

import javax.swing.JComponent;

import javax.swing.JPanel;
import java.awt.Component;

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

    public void repaint() {
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
        add(p);
        this.updateUI();
    }


}