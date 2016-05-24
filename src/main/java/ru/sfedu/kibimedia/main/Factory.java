/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.main;

import ru.sfedu.kibimedia.dao.AnnouncementsDao;
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.dao.impl.AnnouncementsDaoImpl;
import ru.sfedu.kibimedia.dao.impl.NewsDaoImpl;

/**
 *
 * @author DPosadsky
 */
public class Factory {

    public static final Factory instance = new Factory();
    
    private NewsDao newsDao;
    private AnnouncementsDao announcementsDao;
    
    private Factory() { }
    
    public static Factory getInstance() {
        return Factory.instance;    
    }
    
    public NewsDao getNewsDao() {
        if (newsDao == null) 
            newsDao = new NewsDaoImpl();
        return newsDao;
    }
    
    public AnnouncementsDao getAnnouncementsDao() {
        if (announcementsDao == null) 
            announcementsDao = new AnnouncementsDaoImpl();
        return announcementsDao;
    }
    
}
