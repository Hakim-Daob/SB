/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sb.models;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author HMD
 */
@ManagedBean
@RequestScoped

@Entity
@Table(name = "savingsAccount")
@PrimaryKeyJoinColumn(name = "accountNumber")

public class SavingsAccount extends Account implements Serializable 
{
    private long interestRate;
    private long penalty;

    public long getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(long interestRate) {
        this.interestRate = interestRate;
    }

    public long getPenalty() {
        return penalty;
    }

    public void setPenalty(long penalty) {
        this.penalty = penalty;
    }
     public void interestCalculation(long interestRate,long penalty) {
         
        long cal;
        cal=this.getBalance()+(this.getBalance()*interestRate);
       
        
       
               
    }
}
