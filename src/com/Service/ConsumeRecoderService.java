package com.Service;

import com.Entity.ConsumeRecorder;
import com.DAO.ConsumeRecorderDAO;
import com.Entity.IncomeRecorder;

import java.util.Date;

public class ConsumeRecoderService {
      private ConsumeRecorderDAO recorderDAO =new ConsumeRecorderDAO();

    public boolean addConsumeRecorder(String name, String consumeName, double amount, Date date){

        String uid = new UserService().getExitsID(name);
        String consumeID = new ConsumeService().getExitsID(consumeName);
        ConsumeRecorder consumeRecorder = new ConsumeRecorder(uid,consumeID,amount,date);
        System.out.println(uid+"  "+consumeID+"  "+amount+" "+date);
        if(recorderDAO.add(consumeRecorder))
            return true;
        else return false;
    }
}
