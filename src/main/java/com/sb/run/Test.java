/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sb.run;

import com.sb.models.Account;
import com.sb.models.Client;

/**
 *
 * @author HMD
 */
public class Test {
    public static void main(String[] args) {

        Account a2 = new Account();
        a2.setAccountNumber(123);
        a2.setBalance(1000);
        a2.setClient(null);
        a2.setName(null);
        a2.saveUser();
        
        Client c = new Client();
        c.setFirstName("Hakim");
        c.setLastName("Aldaoub");
        c.setGender("Male");
        c.setNationality("Libyan");
        c.setEmail("comscide@yahoo.com");
        c.setPassword("123");
        c.setAccount(a2);
        c.setPhoneNumber("4389924227");
        
        c.saveUser();
        
        
        Account a = new Account();
        a.setAccountNumber(123);
        a.setBalance(1000);
        a.setClient(null);
        a.setName(null);
        
        a.saveUser();
        
    }
}
