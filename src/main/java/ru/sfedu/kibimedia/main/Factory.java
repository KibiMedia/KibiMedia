/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.main;

import ru.sfedu.kibimedia.dao.AnnouncementsDao;
import ru.sfedu.kibimedia.dao.EventRegDao;
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.dao.PagesDao;
import ru.sfedu.kibimedia.dao.PhotosDao;
import ru.sfedu.kibimedia.dao.impl.AnnouncementsDaoImpl;
import ru.sfedu.kibimedia.dao.impl.EventRegDaoImpl;
import ru.sfedu.kibimedia.dao.impl.NewsDaoImpl;
import ru.sfedu.kibimedia.dao.impl.PagesDaoImpl;
import ru.sfedu.kibimedia.dao.impl.PhotosDaoImpl;

/**
 *
 * @author DPosadsky
 */
public class Factory {

    public static final Factory instance = new Factory();
    
    private NewsDao newsDao;
    private AnnouncementsDao announcementsDao;
    private PhotosDao photosDao;
    private PagesDao pagesDao;
    private EventRegDao eventRegDao;
    
    private Factory() { }
    
    public static Factory getInstance() {
        return Factory.instance;    
    }
    
    public NewsDao getNewsDao() {
        if (newsDao == null) 
            newsDao = new NewsDaoImpl();
        return newsDao;
    }
    
    public EventRegDao getEventRegDao() {
        if (eventRegDao== null) 
            eventRegDao = new EventRegDaoImpl() ;
        return eventRegDao;
    }
    
    public AnnouncementsDao getAnnouncementsDao() {
        if (announcementsDao == null) 
            announcementsDao = new AnnouncementsDaoImpl();
        return announcementsDao;
    }
    
    public PhotosDao getPhotosDao() {
        if (photosDao == null) 
            photosDao = new PhotosDaoImpl();
        return photosDao;
    }
    
    public PagesDao getPagesDao() {
        if (pagesDao == null) 
            pagesDao = new PagesDaoImpl();
        return pagesDao;
    }
    
}
