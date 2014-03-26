/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.run;

import com.sb.models.Account;
import com.sb.models.Client;
import com.sb.models.Transaction;
import com.sb.models.Transfer;
import com.sb.models.Withdraw;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HMD
 */
public class Test {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        Client client1 = Client.getClientById(1);

        Account acc = new Account();
        acc.setAccountNumber(222222);
        acc.setName(null);
        acc.setClient(client1);
        List<Transaction> trList = acc.getTransactions();
        acc.setTransactions(trList);
//        long id = acc.saveAccount();
        

//        List<Account> accounts = client1.getAccounts();
//        accounts.add(acc);
//        client1.setAccounts(accounts);
        // client1.updateClient();

//        List<Account> accounts;
//        accounts = new ArrayList<Account>();
        Account a2 = new Account();
        a2.setAccountNumber(123);
        a2.setBalance(3000);
        a2.setClient(null);
        a2.setName("a2");
        a2.saveAccount();
//        accounts.add(a2);
        Account a3 = new Account();
        a3.setAccountNumber(777);
        a3.setBalance(1000);
        a3.setClient(null);
        a3.setName("a3");
        a3.saveAccount();
       
//        accounts.add(a3);

//        Client cli1 = new Client();
//        cli1.setFirstName("Hakim");
//        cli1.setLastName("Aldaoub");
//        cli1.setGender("Male");
//        cli1.setNationality("Libyan");
//        cli1.setEmail("comscide@yahoo.com");
//        cli1.setPassword("123");
//        cli1.setAccounts(accounts);
//        cli1.setPhoneNumber("4389924227");
        Client cli1 = new Client();
        cli1.setFirstName("Hakim");
        cli1.setLastName("Aldaoub");
        cli1.setGender("Male");
        cli1.setNationality("Libyan");
        cli1.setEmail("comscide@yahoo.com");
        cli1.setPassword("123");
//        cli1.setAccounts(accounts);
        cli1.setPhoneNumber("4389924227");
        cli1.saveClient();
        
        Transfer tr = new Transfer();
        tr.transferMoney(a3, a2, 99);
        tr.saveTransfer();
        a2.updateAccount();
        a3.updateAccount();
        
        
        Account a = new Account();
        a.setAccountNumber(456);
        a.setBalance(1000);
        a.setClient(cli1);
        a.setName(null);

//        Withdraw withdraw = new Withdraw();
//        withdraw.withdrawMoney(50, a);
        a.saveAccount();

//         Account a3 = new Account();
//        a3.setAccountNumber(456);
//        a3.setBalance(1000);
//        a3.setClient(null);
//        a3.setName(null);
//        a3.saveUser();
    }
}
