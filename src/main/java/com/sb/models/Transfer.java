package com.sb.models;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
import com.sb.dao.ObjectDao;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author HMD
 */
@ManagedBean
@RequestScoped

@Entity
@Table(name = "transfer")
@PrimaryKeyJoinColumn(name = "transactionId")

public class Transfer extends Transaction {
    
//    private Transaction tr=new Transaction();
    
    public void transferMoney(Account senderAccount, Account recieverAccount, long transferAmount) {
       
        senderAccount.setBalance(senderAccount.getBalance() - transferAmount);
        recieverAccount.setBalance(recieverAccount.getBalance() + transferAmount);
//        tr.setTransactionAmount(transferAmount);

        super.setTransactionAmount(transferAmount); 
    }
    
     public long saveTransfer() {
        ObjectDao userDao = new ObjectDao();
        return userDao.addObject(this);
    }
}
