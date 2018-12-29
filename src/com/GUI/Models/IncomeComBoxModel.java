package com.GUI.Models;

import com.Entity.Income;
import com.Service.IncomeService;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.List;

public class IncomeComBoxModel extends ConsumeComBoxModel{

    public List<String> ItemList = new ArrayList<String>();
    public List<Income> incomes = new IncomeService().list();
    public String c;

    public IncomeComBoxModel(){
        for(Income c:incomes)
            ItemList.add(c.getIncomeName());
//        if(!consumes.isEmpty())
//            c=ItemList.get(0);
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
