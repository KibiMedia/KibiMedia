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
import ru.sfedu.kibimedia.dao.AnnouncementsDao;
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.dao.PagesDao;
import ru.sfedu.kibimedia.dao.PhotosDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Announcements;
import ru.sfedu.kibimedia.tables.News;
import ru.sfedu.kibimedia.tables.Pages;
import ru.sfedu.kibimedia.tables.Photos;

/**
 *
 * @author Сергей
 */
@Controller
public class PreviewController {
    @RequestMapping(value="/previews", method = RequestMethod.GET)
    public String viewHome(Model model) {  
        Factory factory = Factory.getInstance();
        PagesDao pagesDao = factory.getPagesDao();
        AnnouncementsDao announcementsDao = factory.getAnnouncementsDao();
        PhotosDao photosDao = factory.getPhotosDao();
        
        ArrayList<Announcements> announcementses = null;
        ArrayList<Photos> announcementsPhotos = new ArrayList<>();
        ArrayList<Pages> mainPages = null;
        ArrayList<Pages> footerPages = null;

        try {
            mainPages = pagesDao.getPagesByType(0);
            footerPages = pagesDao.getPagesByType(2);
            
            announcementses = announcementsDao.getAnnouncements();
            for (int i = 0; i < announcementses.size(); ++i) 
                announcementsPhotos.add(photosDao.getPhoto(announcementses.get(i).getIdImg()));
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        model.addAttribute("previews", announcementses);
        model.addAttribute("previewsCount", announcementses.size() - 1);
        model.addAttribute("previewsPhotos", announcementsPhotos);
        
        return "previews";
    } 

    @RequestMapping(value="/previews", method = RequestMethod.GET, params = "id")
    public String viewHomeWithId(Model model, @RequestParam(value = "id") int id) {
        Factory factory = Factory.getInstance();
        PagesDao pagesDao = factory.getPagesDao();
        AnnouncementsDao announcementsDao = factory.getAnnouncementsDao();
        
        Announcements announcements = null;
        ArrayList<Pages> mainPages = null;
        ArrayList<Pages> footerPages = null;

        try {
            mainPages = pagesDao.getPagesByType(0);
            footerPages = pagesDao.getPagesByType(2);
            announcements = announcementsDao.getAnnouncement(id);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        model.addAttribute("preview", announcements);
        return "one_preview";
    }
       
}