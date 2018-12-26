package com.tools;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class guiUtils {

    private static String imageFolder = "g:/keshe/familyMoney/static";

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
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
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

}
