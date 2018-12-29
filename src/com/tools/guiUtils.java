package com.tools;
import com.GUI.Panel.updatePasswordPanel;
import com.GUI.Panel.updatePersonInforPanel;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class guiUtils {

    private static String imageFolder = "g:/keshe/familyMoney/static";

    public static Font getFont(String style,int size){
        Font font = new Font("宋体", Font.BOLD, 25);
        return font;
    }
    public static void setImageIcon(JMenu b,String filename,String tip) {
        ImageIcon i = new ImageIcon(new File(imageFolder, filename).getAbsolutePath());
        b.setIcon(i);
        b.setToolTipText(tip);
        b.setVerticalTextPosition(JMenu.BOTTOM);
        b.setHorizontalAlignment(JMenu.CENTER);
        b.setText(tip);
    }

    public  static void SetUI(){

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }


    }

    public static boolean isNull(String str){
        if(str.equals(""))
             return true;
        else
            return false;
    }


}
