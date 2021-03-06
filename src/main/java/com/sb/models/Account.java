/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.models;

import com.sb.dao.ObjectDao;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author HMD
 */
@ManagedBean
@RequestScoped

@Entity
@Table(name = "account")

public class Account implements Serializable {

    @Id
//    @GeneratedValue
    private long accountNumber;

    @Column
    private String name;

    @Column
    private long balance;

    @ManyToOne
//    ( cascade = CascadeType.ALL, fetch = FetchType.EAGER )
//    @JoinColumn(nullable = false)             
    private Client client;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;

//    @OneToMany(mappedBy = "ReciverAccount")
//    private List<Transaction> transactions1;
//    
//    @OneToMany(mappedBy = "SenderAccount")
//    private List<Transaction> transactions;
//    public Account(long accountNumber,long balance) {
//        this.accountNumber = accountNumber;
//        this.balance=balance;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void credit(long amount) {
        this.balance = this.balance + amount;
    }

    public void debit(long amount) {
        this.balance = this.balance - amount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

//    public List<Transaction> getTransactions() {
//        return transactions;
//    }
//
//    public void setTransactions(List<Transaction> transactions) {
//        this.transactions = transactions;
//    }
//
//    public List<Transaction> getTransactions1() {
//        return transactions1;
//    }
//
//    public void setTransactions1(List<Transaction> transactions1) {
//        this.transactions1 = transactions1;
//    }
    public void creatAccountById(long idNumber, long balance)
    {
        Client client1 = Client.getClientById(idNumber);
        Account account1 = new Account();
        account1.setBalance(balance);
        account1.setClient(client1);
        account1.setTransactions(null);
        account1.saveAccount();
    }
    public long saveAccount() {
        ObjectDao userDao = new ObjectDao();
        return userDao.addObject(this);
    }
     public void updateAccount() throws IllegalAccessException, InvocationTargetException {
        ObjectDao<Account> accountDao = new ObjectDao<Account>();
        
        accountDao.updateObject(this,this.getAccountNumber(),Account.class);
    }

}
