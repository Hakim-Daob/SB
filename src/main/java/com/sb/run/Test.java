/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.run;

import com.sb.models.Account;
import com.sb.models.Client;
import com.sb.models.Transaction;
import com.sb.models.Withdraw;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HMD
 */
public class Test {

    public static void main(String[] args) {

        List<Account> accounts;
        accounts = new ArrayList<Account>();
        Account a2 = new Account();
        a2.setAccountNumber(123);
        a2.setBalance(1000);
        a2.setClient(null);
        a2.setName(null);
        a2.saveUser();
        accounts.add(a2);

        Client c = new Client();
        c.setFirstName("Hakim");
        c.setLastName("Aldaoub");
        c.setGender("Male");
        c.setNationality("Libyan");
        c.setEmail("comscide@yahoo.com");
        c.setPassword("123");
        c.setAccounts(accounts);
        c.setPhoneNumber("4389924227");

        c.saveUser();

        Account a = new Account();
        a.setAccountNumber(456);
        a.setBalance(1000);
        a.setClient(c);
        a.setName(null);

        Withdraw withdraw = new Withdraw();
        withdraw.withdrawMoney(50, a);
        
        a.saveUser();
    }
}
