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
    
    @Column(name = "main_idea")
    private String mainIdea;

    @Column(name = "text")
    private String text;
    
    @Column(name = "id_writer")
    private Integer idWriter;
    
    @Column(name = "data")
    private Date data; 
    
    @Column(name = "id_img")
    private Integer idImg;
   
    public Integer getIdNews() {
        return idNews;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainIdea() {
        return mainIdea;
    }

    public void setMainIdea(String mainIdea) {
        this.mainIdea = mainIdea;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public Integer getIdWriter() {
        return idWriter;
    }

    public void setIdWriter(Integer idWriter) {
        this.idWriter = idWriter;
    }
    
    @Override
    public String toString() {
        return this.title;
    }

    public Date getDate() {
        return data;
    }

    public void setDate(Date data) {
        this.data = data;
    }

    public Integer getIdImg() {
        return idImg;
    }

    public void setIdImg(Integer idImg) {
        this.idImg = idImg;
    }
}
    