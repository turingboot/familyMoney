package com.Service;

import com.Entity.Consume;
import com.DAO.ConsumeDAO;
import java.util.ArrayList;
import java.util.List;


public class ConsumeService {
   ConsumeDAO consumeDAO = new ConsumeDAO();

    public List<Consume> list() {
        List<Consume> cs= consumeDAO.list();
        return cs;
    }

    public List<String> listName(){
        List<Consume> cs = consumeDAO.list();
        List<String> list = new ArrayList<>();
        for (Consume c:cs){
           list.add(c.getConsumeName());
        }
        return list;
    }

    public boolean addConsume(String id,String name){
        Consume consume = new Consume(id,name);
        if(consumeDAO.add(consume))
            return true;
        else
            return false;

    }

    public  boolean updateConsume(String id ,String name){
        if (consumeDAO.upDate(id,name))
            return true;
        else return false;
    }

    public String getExitsID(String name){

        return consumeDAO.selectInfor(name,"consumeID");

    }
}


