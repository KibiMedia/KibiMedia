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
@Table(name = "employee")
public class Employee implements Serializable{
    
    private static final long serialVersionUID = -1L;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Integer idEmployee;
    
    @Column(name = "full_name")
    private String fullName;
    
    @Column(name = "pos")
    private String pos;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "href_photo")
    private String hrefPhoto;
    
    @Column(name = "phone")
    private Integer phone;

    public Integer getIdEmployee() {
        return idEmployee;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public String getPosition() {
        return pos;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getHrefPhoto() {
        return hrefPhoto;
    }
    
    public Integer getPhone() {
        return phone;
    }
    
    public void setIdEmployee(Integer id) {
        this.idEmployee = id;
    }
    
    public void setFullName(String name) {
        this.fullName = name;
    }
    
    public void setPosition(String pos) {
        this.pos = pos;
    }
    
    public void setDescription(String desc) {
        this.description = desc;
    }
    
    public void setHrefPhoto(String href) {
        this.hrefPhoto = href;
    }
    
    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    
}
