/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.main;

import ru.sfedu.kibimedia.dao.AlbumsDao;
import ru.sfedu.kibimedia.dao.AlbumsPhotoDao;
import ru.sfedu.kibimedia.dao.AnnouncementsDao;
import ru.sfedu.kibimedia.dao.AwardsDao;
import ru.sfedu.kibimedia.dao.EventRegDao;
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.dao.PagesDao;
import ru.sfedu.kibimedia.dao.PhotosDao;
import ru.sfedu.kibimedia.dao.VideosDao;
import ru.sfedu.kibimedia.dao.impl.AlbumsDaoImpl;
import ru.sfedu.kibimedia.dao.impl.AlbumsPhotoDaoImpl;
import ru.sfedu.kibimedia.dao.impl.AnnouncementsDaoImpl;
import ru.sfedu.kibimedia.dao.impl.AwardsDaoImpl;
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
    private AnnouncementsDao announcementsDao;
    private PhotosDao photosDao;
    private PagesDao pagesDao;
    private EventRegDao eventRegDao;
    private AlbumsDao albumsDao;
    private AlbumsPhotoDao albumsPhotoDao;
    private AwardsDao awardsDao;
    private VideosDao videosDao;

    
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
    
    public AlbumsDao getAlbumsDao() {
        if (albumsDao == null) 
            albumsDao = new AlbumsDaoImpl();
        return albumsDao;
    }
    
    public AlbumsPhotoDao getAlbumsPhotoDao() {
        if (albumsPhotoDao == null) 
            albumsPhotoDao = new AlbumsPhotoDaoImpl();
        return albumsPhotoDao;
    }
    
    public AwardsDao getAwardsDao() {
        if (awardsDao == null) 
            awardsDao = new AwardsDaoImpl();
        return awardsDao;
    }
    
    public VideosDao getVideosDao() {
        if (videosDao == null) 
            videosDao = new VideosDaoImpl();
        return videosDao;
    }
    
}
