package com.Service;

import com.DAO.IncomeRecorderDAO;
import com.Entity.IncomeRecorder;
import java.util.Date;

public class IncomeRecorderService {

    IncomeRecorderDAO recordDao = new IncomeRecorderDAO();

    public boolean addIncomeRecorder(String name,String incomeName,double amount,Date date){

         String uid = new UserService().getExitsID(name);
         String incomeID = new IncomeService().getExitsID(incomeName);
         IncomeRecorder incomeRecorder = new IncomeRecorder(uid,incomeID,amount,date);
         System.out.println(uid+"  "+incomeID+"  "+amount+" "+date);
         if(recordDao.add(incomeRecorder))
             return true;
         else return false;
    }
}
