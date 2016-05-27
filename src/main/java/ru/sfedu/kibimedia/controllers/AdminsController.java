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
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Announcements;
import ru.sfedu.kibimedia.tables.News;

/**
 *
 * @author 1
 */
@Controller
public class AdminsController {
    @RequestMapping(value="/admin")
    public String viewAdmins() {  
        return "admins_page";
    }
    
    @RequestMapping(value="/admin/ann", method = RequestMethod.GET)
    public String viewAnnounce(Model model) { 
        Factory factory = Factory.getInstance();
        
        AnnouncementsDao announcementsDao = factory.getAnnouncementsDao();
        
        ArrayList<Announcements> announcements = null;
        
        try {
            announcements = announcementsDao.getAnnouncements();
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }   
        
        model.addAttribute("announcements", announcements);  
        model.addAttribute("announCount", announcements.size()-1); 
        return "announ_table";
    }
    
    @RequestMapping(value="/admin/news", method = RequestMethod.GET)
    public String viewNews(Model model) { 
        Factory factory = Factory.getInstance();
        
        NewsDao newsDao = factory.getNewsDao();
        
        ArrayList<News> allNews = null;
        
        try {
            allNews = newsDao.getAllNews();
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }   
        model.addAttribute("allNews", allNews);
        model.addAttribute("newsCount", allNews.size() - 1);
        return "news_table";
    }
    
    @RequestMapping(value="/admin/photo")
    public String viewPhoto() {  
        return "change_photos";
    }
    
    @RequestMapping(value="/admin/video")
    public String viewVideo() {  
        return "change_video";
    }
}