package com.Service;

import com.DAO.IncomeDAO;
import com.Entity.Income;
import java.util.ArrayList;
import java.util.List;

public class IncomeService {

    IncomeDAO incomeDAO = new IncomeDAO();
    public List<Income> list() {
        List<Income> cs= incomeDAO.list();
        return cs;
    }

    public List<String> listName(){
        List<Income> cs = new IncomeDAO().list();
        List<String> list = new ArrayList<>();
        for (Income c:cs){
            list.add(c.getIncomeName());
        }
        return list;
    }

    public boolean addIncome(String id,String name){
        Income income = new Income(id,name);
        if(incomeDAO.add(income))
            return true;
        else
            return false;

    }

    public  boolean updateIncome(String id ,String name){
        if (incomeDAO.upDate(id,name))
            return true;
        else return false;
    }


    public String getExitsID(String name){

        return incomeDAO.selectInfor(name,"incomeID");

    }
}
