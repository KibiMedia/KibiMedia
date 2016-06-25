/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.main;

import ru.sfedu.kibimedia.dao.AlbumDao;
import ru.sfedu.kibimedia.dao.AlbumPhotoDao;
import ru.sfedu.kibimedia.dao.PreviewDao;
import ru.sfedu.kibimedia.dao.AwardDao;
import ru.sfedu.kibimedia.dao.EmployeeDao;
import ru.sfedu.kibimedia.dao.EventRegDao;
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.dao.PageDao;
import ru.sfedu.kibimedia.dao.PhotoDao;
import ru.sfedu.kibimedia.dao.VideoDao;
import ru.sfedu.kibimedia.dao.impl.AlbumDaoImpl;
import ru.sfedu.kibimedia.dao.impl.AlbumPhotoDaoImpl;
import ru.sfedu.kibimedia.dao.impl.PreviewDaoImpl;
import ru.sfedu.kibimedia.dao.impl.AwardDaoImpl;
import ru.sfedu.kibimedia.dao.impl.EmployeeDaoImpl;
import ru.sfedu.kibimedia.dao.impl.EventRegDaoImpl;
import ru.sfedu.kibimedia.dao.impl.NewsDaoImpl;
import ru.sfedu.kibimedia.dao.impl.PageDaoImpl;
import ru.sfedu.kibimedia.dao.impl.PhotoDaoImpl;
import ru.sfedu.kibimedia.dao.impl.VideoDaoImpl;

/**
 *
 * @author DPosadsky
 */
public class Factory {

    public static final Factory instance = new Factory();
    
    private NewsDao newsDao;
    private PreviewDao previewDao;
    private PhotoDao photoDao;
    private PageDao pageDao;
    private EventRegDao eventRegDao;
    private AlbumDao albumDao;
    private AlbumPhotoDao albumPhotoDao;
    private AwardDao awardDao;
    private VideoDao videoDao;
    private EmployeeDao employeeDao;

    
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
    
    public PreviewDao getPreviewDao() {
        if (previewDao == null) 
            previewDao = new PreviewDaoImpl();
        return previewDao;
    }
    
    public PhotoDao getPhotoDao() {
        if (photoDao == null) 
            photoDao = new PhotoDaoImpl();
        return photoDao;
    }
    
    public PageDao getPageDao() {
        if (pageDao == null) 
            pageDao = new PageDaoImpl();
        return pageDao;
    }
    
    public AlbumDao getAlbumDao() {
        if (albumDao == null) 
            albumDao = new AlbumDaoImpl();
        return albumDao;
    }
    
    public AlbumPhotoDao getAlbumPhotoDao() {
        if (albumPhotoDao == null) 
            albumPhotoDao = new AlbumPhotoDaoImpl();
        return albumPhotoDao;
    }
    
    public AwardDao getAwardDao() {
        if (awardDao == null) 
            awardDao = new AwardDaoImpl();
        return awardDao;
    }
    
    public VideoDao getVideoDao() {
        if (videoDao == null) 
            videoDao = new VideoDaoImpl();
        return videoDao;
    }
    
    public EmployeeDao getEmployeeDao() {
        if (employeeDao == null) 
            employeeDao = new EmployeeDaoImpl();
        return employeeDao;
    }
    
}
