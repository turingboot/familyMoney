package com.Service;

import com.DAO.IncomeDAO;
import com.Entity.Income;
import com.Entity.IncomeRecorder;

import java.util.Collections;
import java.util.List;

public class IncomeService {

    IncomeDAO incomeDAO = new IncomeDAO();
    public List<Income> list() {
        List<Income> cs= incomeDAO.list();
        return cs;
    }

}
