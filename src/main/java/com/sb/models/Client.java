/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sb.models;

import com.sb.dao.ObjectDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 *
 * @author Hakim
 */

    
@ManagedBean
@RequestScoped

@Entity
@Table(name = "client")


public class Client implements Serializable {
   
   
    

    @Id
    @GeneratedValue
    private long clientId;

   
    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String gender;
    
    @Column
    private String nationality;

//    @Column
//    @Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
//    private DateTime dateOfBirth;

    @Column
    private String phoneNumber;
    

    @OneToMany(mappedBy = "client")
    private List<Account> accounts;
    
     public long getClientId() {
        return clientId;
    }

    public void setClientId(long userId) {
        this.clientId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

//    public DateTime getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(DateTime dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



   

//    public void updateUser() {
//        ObjectDao userDao = new ObjectDao();
//        userDao.updateObject(this);
//    }
//
//    public void deleteUser() {
//        ObjectDao userDao = new ObjectDao();
//        userDao.deleteObject(this);
//    }
//
//    public ArrayList<User> getAllUsers() {
//        ArrayList<User> users; 
//        ObjectDao userDao = new ObjectDao();
//        users = userDao.getAllObjects("user");
//        return users;
//    }
//
//    private void clearAll() {
//        this.clientId = 0;
//        this.firstName = "";
//        this.lastName = "";
//        //this.simpleDate = "";
//        this.email = "";
//        this.password = "";
//        this.gender = "";
//        this.phoneNumber = "";
//        this.dateOfBirth = null;
//        this.email = "";
//
//    }
//} 

//    
    

    
     public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    

    
     public void saveUser() {
        ObjectDao userDao = new ObjectDao();
        userDao.addObject(this);
    }
}
