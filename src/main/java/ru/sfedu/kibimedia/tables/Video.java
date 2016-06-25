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
 * @author 1
 */
@Entity
@Table(name = "video")
public class Video implements Serializable{
    
    private static final long serialVersionUID = -5527566248002296042L;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_video")
    private int idVideo;
    
    @Column(name = "href")
    private String href;

    public int getIdVideo() {
        return idVideo;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setIdVideo(int idVideo) {
        this.idVideo = idVideo;
    }
    
    
}
