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
@Table(name = "event_reg")
public class EventReg implements Serializable{
    
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
    
    @Column(name = "id_event")
    private Integer idEvent;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "Name_of_lider")
    private String leader;
    
    @Column(name = "organization")
    private String Organization;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "description")
    private String description;
    
    public Integer getIdEvent() {
        return idEvent;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String Leader) {
        this.leader = Leader;
    }
    
    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
