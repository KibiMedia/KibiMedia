/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sfedu.kibimedia.dao.AnnouncementsDao;
import ru.sfedu.kibimedia.dao.EventRegDao;
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Announcements;
import ru.sfedu.kibimedia.tables.EventReg;
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
        //News newNews = null;
        
        try {
            allNews = newsDao.getAllNews();
            //newsDao.addNews(newsDao.getNews(5));
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }   
        model.addAttribute("allNews", allNews);
        model.addAttribute("newsCount", allNews.size() - 1);
        return "news_table";
    }
    
    @RequestMapping(value="/admin/news/add", method = RequestMethod.POST, 
            params = {"id_news", "title", "description", "text", "id_writer", "event_date", "id_img"})
    public void addNews(Model model, 
                        @RequestParam(value = "id_news") int idNews,
                        @RequestParam(value = "title") String title,
                        @RequestParam(value = "description") String description,
                        @RequestParam(value = "text") String text,
                        @RequestParam(value = "id_writer") int idWriter,
                        @RequestParam(value = "event_date") Date eventDate,
                        @RequestParam(value = "id_img") int idImg){
        
        News news = null;
        Factory factory = Factory.getInstance();
        NewsDao newsDao = factory.getNewsDao();
        
        news.setIdImg(idImg);
        news.setTitle(title);
        news.setDescription(description);
        news.setText(text);
        news.setIdWriter(idWriter);
        news.setEventDate(eventDate);
        news.setIdImg(idImg);

        try {
            newsDao.addNews(news);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
    }
    
    /*@RequestMapping(value="/admin/news/chng", method = RequestMethod.POST, 
            params = {"id_news", "title", "description", "text", "id_writer", "event_date", "id_img"})
    public void changeNews(Model model, 
                        @RequestParam(value = "id_news") int idNews,
                        @RequestParam(value = "title") String title,
                        @RequestParam(value = "description") String description,
                        @RequestParam(value = "text") String text,
                        @RequestParam(value = "id_writer") int idWriter,
                        @RequestParam(value = "event_date") Date eventDate,
                        @RequestParam(value = "id_img") int idImg){
        
        News news = null;
        Factory factory = Factory.getInstance();
        NewsDao newsDao = factory.getNewsDao();
        
        news.setIdImg(idImg);
        news.setTitle(title);
        news.setDescription(description);
        news.setText(text);
        news.setIdWriter(idWriter);
        news.setEventDate(eventDate);
        news.setIdImg(idImg);

        try {
            newsDao.addNews(news);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
    }*/
    
    @RequestMapping(value="/admin/news/chng", method = RequestMethod.GET, 
            params = "id")
    public String changeNews(Model model, 
                        @RequestParam(value = "id") int id){
        
        News news = null;
        Factory factory = Factory.getInstance();
        NewsDao newsDao = factory.getNewsDao();

        try {
            news = newsDao.getNews(id);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("news", news);
        
        return "change_one_news";
    }
    
    @RequestMapping(value="/admin/news/del", method = RequestMethod.POST, params = "idNews")
    public void deleteNews(Model model, @RequestParam(value = "idNews") int id) {
        
        Factory factory = Factory.getInstance();
        NewsDao newsDao = factory.getNewsDao();
                
        try {
            newsDao.deleteNews(id);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
    }
    
    @RequestMapping(value="/admin/photo")
    public String viewPhoto() {  
        return "change_photos";
    }
    
    @RequestMapping(value="/admin/video")
    public String viewVideo() {  
        return "change_video";
    }
    
    @RequestMapping(value="/admin/sign_up", method = RequestMethod.GET)
    public String viewSignUp(Model model) {
        
        Factory factory = Factory.getInstance();
        EventRegDao eventRegDao = factory.getEventRegDao();
        
        ArrayList<EventReg> events = null; 
        
        try {
            events = eventRegDao.getEvents();
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }   
        model.addAttribute("events", events);
        model.addAttribute("eventsCount", events.size() - 1);
        
        return "sign_up_table";
    }
}