package com.Service;


import com.Entity.Consume;
import com.DAO.ConsumeDAO;

import java.util.ArrayList;
import java.util.List;

public class ConsumeService {

    public List<Consume> list() {
        List<Consume> cs= new ConsumeDAO().list();
        return cs;
    }

    public List<String> listName(){
        List<Consume> cs = new ConsumeDAO().list();
        List<String> list = new ArrayList<>();
        for (Consume c:cs){
           list.add(c.getConsumeName());
        }
        return list;
    }

}
