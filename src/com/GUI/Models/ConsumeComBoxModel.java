package com.GUI.Models;

import com.Entity.Consume;
import com.Service.ConsumeService;
import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.List;

public class ConsumeComBoxModel implements ComboBoxModel{
    public List<String> ItemList = new ConsumeService().listName();
    public String c;

    public ConsumeComBoxModel(){
        if(!ItemList.isEmpty())
            c=ItemList.get(0);
    }
    @Override
    public void setSelectedItem(Object anItem) {
        c =(String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        if(!ItemList.isEmpty())
            return c;
        else
        return null;
    }

    @Override
    public int getSize() {
        return ItemList.size();
    }

    @Override
    public String getElementAt(int index) {
        return ItemList.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
}
