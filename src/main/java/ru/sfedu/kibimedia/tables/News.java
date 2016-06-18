/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.tables;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author Mishas
 */
@Entity
@Table(name = "news")
public class News implements Serializable{
    
    private static final long serialVersionUID = -5527566248002296042L;
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_news")
    private Integer idNews;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "description")
    private String description;

    @Column(name = "text")
    private String text;
    
    @Column(name = "event_date")
    @Temporal(value=TemporalType.DATE)
    private Date eventDate; 
    
    @Column(name = "id_img")
    private Integer idImg;
   
    public Integer getIdNews() {
        return idNews;
    }
    
    public void seIdNews(Integer idNews) {
        this.idNews = idNews;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public String toString() {
        return this.title;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Integer getIdImg() {
        return idImg;
    }

    public void setIdImg(Integer idImg) {
        this.idImg = idImg;
    }

    public void setIdNews(Integer idNews) {
        this.idNews = idNews;
    }
}
    