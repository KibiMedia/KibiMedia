/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.tables;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Mishas
 */
@Entity
@Table(name = "organization")
public class Organizations implements Serializable{
    
    private static final long serialVersionUID = -5527566248002296042L;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    */
    
    @Column(name = "id_organization")
    private Integer idOrganization;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "adress")
    private String adress;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "phone")
    private String phone;
    
    public Integer getIdOrganization() {
        return idOrganization;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
