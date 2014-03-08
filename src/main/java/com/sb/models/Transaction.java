/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.models;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.joda.time.DateTime;

/**
 *
 * @author Hakim
 */
@ManagedBean
@RequestScoped

@Entity
@Table(name = "transaction")
//@Inheritance(strategy = InheritanceType.JOINED)

public class Transaction implements Serializable {

    @Id
    @GeneratedValue
    private long transactionId;

    @Column
    private DateTime date;

    @Column
    private long transactionAmount;

//    @ManyToOne
//    @JoinColumn(name = "accountNumber")
    
//    @OneToOne
//    private Account SenderAccount;

//    @ManyToOne
//    @JoinColumn(name = "accountNumber")
    
//    @OneToOne
//    private Account ReciverAccount;

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

//    public Account getSenderAccount() {
//        return SenderAccount;
//    }
//
//    public void setSenderAccount(Account SenderAccount) {
//        this.SenderAccount = SenderAccount;
//    }
//
//    public Account getReciverAccount() {
//        return ReciverAccount;
//    }
//
//    public void setReciverAccount(Account ReciverAccount) {
//        this.ReciverAccount = ReciverAccount;
//    }

  

    public long getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(long transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

//    public void execute()
//    {
//    
//    }
}
