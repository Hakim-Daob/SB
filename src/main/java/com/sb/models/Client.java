/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.models;

import com.sb.dao.ObjectDao;
import com.sb.persistence.HibernateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.Session;

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
    private String cardNumber;

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

    private Client client1;

    @OneToMany(mappedBy = "client")
//    , cascade={CascadeType.ALL}

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
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Client getClient1() {
        return client1;
    }

    public void setClient1(Client client1) {
        this.client1 = client1;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
     public long saveClient() {
        ObjectDao userDao = new ObjectDao();
        return userDao.addObject(this);
    }
//public void createClient()
//{
//    
//}
    public static Client getClientById(long id) {
        Client ClientHolder = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            ClientHolder = (Client) session.get(Client.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return ClientHolder;
    }

//    public void displayClient(long clientId) {
////           public void populateUserAppointments() {
////        ArrayList<Appointment> tempHolder = Appointment.getAppointmentsByUserId(5);
////        userAppointments = tempHolder;
////    }
//        clientId=clientId1;
//        Client tempHolder = getClientById(clientId);
//        client1 = tempHolder;

//    public long saveUser() {
//        ObjectDao userDao = new ObjectDao();
//        userDao.addObject(this);
//    }

}



 
 

