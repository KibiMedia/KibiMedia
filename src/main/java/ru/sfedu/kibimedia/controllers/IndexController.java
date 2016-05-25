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
import ru.sfedu.kibimedia.dao.AnnouncementsDao;
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.dao.PhotosDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Announcements;
import ru.sfedu.kibimedia.tables.News;
import ru.sfedu.kibimedia.tables.Photos;

/**
 *
 * @author DPosadsky
 */
@Controller
public class IndexController {
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String viewHome(Model model) {
        Factory factory = Factory.getInstance();
        NewsDao newsDao = factory.getNewsDao();
        AnnouncementsDao announcementsDao = factory.getAnnouncementsDao();
        PhotosDao photosDao = factory.getPhotosDao();
        ArrayList<News> sixNews = null;
        ArrayList<Announcements> threeNews = null;
        ArrayList<Photos> newsPhotos = new ArrayList<>();
        ArrayList<Photos> previewPhotos = null;
        try {
            sixNews = newsDao.getLastSixNews(); 
            for (int i = 0; i < 6; ++i) {
                newsPhotos.add(photosDao.getPhotos(sixNews.get(i).getIdImg()));
            }
            threeNews = announcementsDao.getAllAnnouncements();
            //for (int i = 0; i < threeNews.size(); ++i) {
                //previewPhotos.add(photosDao.getPhotos(threeNews.get(i).getIdImg()));
            //}
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }       
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("imgUrl", "resources/images/page-1_img4.jpg");
        model.addAttribute("news", sixNews);
        model.addAttribute("newsPhotos", newsPhotos);
        model.addAttribute("preview", threeNews);
        model.addAttribute("previewCount", threeNews.size() - 1);
        return "index";
    }
    /*
    @RequestMapping(value="/home", method = RequestMethod.GET, params = "newPar")
    public String viewHomeWithParams() {
        System.out.println("newPar");
        return "home";
    }
    */
    
}
