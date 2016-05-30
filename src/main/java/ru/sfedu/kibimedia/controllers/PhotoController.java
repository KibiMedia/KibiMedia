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
import ru.sfedu.kibimedia.dao.AlbumsDao;
import ru.sfedu.kibimedia.dao.PagesDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Albums;
import ru.sfedu.kibimedia.tables.Pages;

/**
 *
 * @author Сергей
 */
@Controller
public class PhotoController {
    @RequestMapping(value="/photo", method = RequestMethod.GET)
    public String viewHome(Model model) {  
        Factory factory = Factory.getInstance();
        PagesDao pagesDao = factory.getPagesDao();
        AlbumsDao albumsDao = factory.getAlbumsDao();
        
        ArrayList<Pages> mainPages = null;
        ArrayList<Pages> footerPages = null;
        
        ArrayList<Albums> albums = null;

        try {
            mainPages = pagesDao.getPagesByType(0);
            footerPages = pagesDao.getPagesByType(2);
            
            albums = albumsDao.getAlbums();
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        
        model.addAttribute("albums", albums);
        model.addAttribute("albumsCount", albums.size() - 1);
        
        return "photo";
    }
     
}
