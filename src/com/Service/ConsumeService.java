package com.Service;

import com.DAO.IncomeDAO;
import com.Entity.Consume;
import com.DAO.ConsumeDAO;

import java.util.List;

public class ConsumeService {


    public List<Consume> list() {
        List<Consume> cs= new ConsumeDAO().list();
        return cs;
    }

}
