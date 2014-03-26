package com.sb.models;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
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
@Table(name = "withdraw")
@PrimaryKeyJoinColumn(name = "transactionId")

public class Withdraw extends Transaction implements Serializable {

    public void withdrawMoney(long amount, Account account) {
        long balance = account.getBalance();
        balance  -= amount;
        account.setBalance(balance);
        
    }
}
