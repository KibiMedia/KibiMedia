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
@Table(name = "coments")
public class Coments implements Serializable{
    
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
    
    @Column(name = "id_coment")
    private Integer idComent;
    
    @Column(name = "id_writer")
    private Integer idWriter;
    
    @Column(name = "id_news")
    private Integer idNews; 
    
    @Column(name = "text")
    private String text;

    public Integer getIdComent() {
        return idComent;
    }
    
    public Integer getIdWriter() {
        return idWriter;
    }

    public void setIdWriter(Integer idWriter) {
        this.idWriter = idWriter;
    }
    
    public Integer getIdNews() {
        return idNews;
    }

    public void setIdNews(Integer idNews) {
        this.idNews = idNews;
    }
    
    public String getText() {
        return text;
    }

    public void setTitle(String text) {
        this.text = text;
    }

}
