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
import ru.sfedu.kibimedia.dao.PagesDao;
import ru.sfedu.kibimedia.dao.PhotosDao;
import ru.sfedu.kibimedia.dao.VideosDao;
import ru.sfedu.kibimedia.dao.impl.AlbumDaoImpl;
import ru.sfedu.kibimedia.dao.impl.AlbumPhotoDaoImpl;
import ru.sfedu.kibimedia.dao.impl.PreviewDaoImpl;
import ru.sfedu.kibimedia.dao.impl.AwardDaoImpl;
import ru.sfedu.kibimedia.dao.impl.EmployeeDaoImpl;
import ru.sfedu.kibimedia.dao.impl.EventRegDaoImpl;
import ru.sfedu.kibimedia.dao.impl.NewsDaoImpl;
import ru.sfedu.kibimedia.dao.impl.PagesDaoImpl;
import ru.sfedu.kibimedia.dao.impl.PhotosDaoImpl;
import ru.sfedu.kibimedia.dao.impl.VideosDaoImpl;

/**
 *
 * @author DPosadsky
 */
public class Factory {

    public static final Factory instance = new Factory();
    
    private NewsDao newsDao;
    private PreviewDao previewDao;
    private PhotosDao photosDao;
    private PagesDao pagesDao;
    private EventRegDao eventRegDao;
    private AlbumDao albumDao;
    private AlbumPhotoDao albumPhotoDao;
    private AwardDao awardDao;
    private VideosDao videosDao;
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
    
    public VideosDao getVideosDao() {
        if (videosDao == null) 
            videosDao = new VideosDaoImpl();
        return videosDao;
    }
    
    public EmployeeDao getEmployeeDao() {
        if (employeeDao == null) 
            employeeDao = new EmployeeDaoImpl();
        return employeeDao;
    }
    
}
