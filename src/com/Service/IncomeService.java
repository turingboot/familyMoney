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
}
