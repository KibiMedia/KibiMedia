/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sfedu.kibimedia.dao.AlbumDao;
import ru.sfedu.kibimedia.dao.AlbumPhotoDao;
import ru.sfedu.kibimedia.dao.PageDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Album;
import ru.sfedu.kibimedia.tables.AlbumPhoto;
import ru.sfedu.kibimedia.tables.Page;

/**
 *
 * @author Сергей
 */
@Controller
public class PhotoController {
    @RequestMapping(value="/photo", method = RequestMethod.GET)
    public String viewHome(Model model) {  
        Factory factory = Factory.getInstance();
        PageDao pageDao = factory.getPageDao();
        AlbumDao albumDao = factory.getAlbumDao();
        
        ArrayList<Page> mainPages = null;
        ArrayList<Page> footerPages = null;
        
        ArrayList<Album> album = null;

        try {
            mainPages = pageDao.getPagesByType(0);
            footerPages = pageDao.getPagesByType(2);
            
            album = albumDao.getAlbum();
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        
        model.addAttribute("album", album);
        model.addAttribute("albumCount", album.size() - 1);
        
        return "photo";
    }
    
    @RequestMapping(value="/photo", method = RequestMethod.GET, params = "id")
    public String viewHomeWithId(Model model, @RequestParam(value = "id") int id) {
        Factory factory = Factory.getInstance();
        PageDao pageDao = factory.getPageDao();
        AlbumPhotoDao albumPhotoDao = factory.getAlbumPhotoDao();
        AlbumDao albumDao = factory.getAlbumDao();
        
        ArrayList<AlbumPhoto> albumPhoto = null;
        ArrayList<Page> mainPages = null;
        ArrayList<Page> footerPages = null;
        
        String albumName = "";

        try {
            mainPages = pageDao.getPagesByType(0);
            footerPages = pageDao.getPagesByType(2);
            albumPhoto = albumPhotoDao.getPhotoByAlbum(id);
            albumName = albumDao.getAlbumById(id).getTitle();
            
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        model.addAttribute("albumPhoto", albumPhoto);
        model.addAttribute("albumPhotoCount", albumPhoto.size() - 1);
        model.addAttribute("albumName", albumName);
        
        return "one_album_photo";
    }
     
}
