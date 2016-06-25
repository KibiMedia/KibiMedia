/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.controllers;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sfedu.kibimedia.dao.PreviewDao;
import ru.sfedu.kibimedia.dao.EventRegDao;
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.dao.VideoDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Preview;
import ru.sfedu.kibimedia.tables.EventReg;
import ru.sfedu.kibimedia.tables.News;
import ru.sfedu.kibimedia.tables.Video;

/**
 *
 * @author 1
 */
@Controller
public class AdminController {
    @RequestMapping(value="/admin", method = RequestMethod.GET)
    public String viewAdmin() {  
        return "admin_page";
    }
    
    /**
     * 
     * News 
     */
    
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
    
    @RequestMapping(value="/admin/news/add", method = RequestMethod.GET)
    public String addNews(Model model) {
        model.addAttribute("action", "add");
        
        return "change_one_news";
    }
    
    @RequestMapping(value="/admin/news/add", method = RequestMethod.GET, 
            params = {"id", "title", "description", "text", "event_date", "id_img"})
    public String addNews(Model model, 
                        @RequestParam(value = "id") String id,
                        @RequestParam(value = "title") String title,
                        @RequestParam(value = "description") String description,
                        @RequestParam(value = "text") String text,
                        @RequestParam(value = "event_date") String eventDate,
                        @RequestParam(value = "id_img") int idImg){
        
        News news = new News();
        Factory factory = Factory.getInstance();
        NewsDao newsDao = factory.getNewsDao();

        news.setTitle(title);
        news.setDescription(description);
        news.setText(text);
        try {
        news.setEventDate(new SimpleDateFormat("yyyy-MM-dd").parse(eventDate));
        } catch (ParseException ex) {
            System.out.println("Exception in admin/news/add with param" + ex);
        }
        news.setIdImg(idImg);

        try {
            newsDao.addNews(news);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        return "change_one_news";
    }
    
    @RequestMapping(value="/admin/news/change", method = RequestMethod.GET, params = "id")
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
        model.addAttribute("action", "change");
        
        return "change_one_news";
    }
    
    @RequestMapping(value="/admin/news/change", method = RequestMethod.GET, 
            params = {"id", "title", "description", "text", "event_date", "id_img"})
    public String changeNews(Model model, 
                        @RequestParam(value = "id") int id,
                        @RequestParam(value = "title") String title,
                        @RequestParam(value = "description") String description,
                        @RequestParam(value = "text") String text,
                        @RequestParam(value = "event_date") String eventDate,
                        @RequestParam(value = "id_img") int idImg){
        
        News news = new News();
        Factory factory = Factory.getInstance();
        NewsDao newsDao = factory.getNewsDao();
                
        news.setIdNews(id);
        news.setTitle(title);
        news.setDescription(description);
        news.setText(text);
        try {
        news.setEventDate(new SimpleDateFormat("yyyy-MM-dd").parse(eventDate));
        } catch (ParseException ex) {
            System.out.println("Exception in admin/news/change with param" + ex);
        }
        news.setIdImg(idImg);

        try {
            newsDao.updateNews(news);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        return "change_one_news";
    }
    
    @RequestMapping(value="/admin/news/del", method = RequestMethod.GET, params = "id")
    public String deleteNews(Model model, @RequestParam(value = "id") int id) {
        
        Factory factory = Factory.getInstance();
        NewsDao newsDao = factory.getNewsDao();
                
        try {
            newsDao.deleteNews(id);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        return "admin_page";
    }
    
    
    
    /**
     * 
     * Preview 
     */
    
    @RequestMapping(value="/admin/preview", method = RequestMethod.GET)
    public String viewPreview(Model model) { 
        Factory factory = Factory.getInstance();
        
        PreviewDao previewDao = factory.getPreviewDao();
        
        ArrayList<Preview> previews = null;      
        try {
            previews = previewDao.getPreviews();
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }   
        model.addAttribute("previews", previews);
        model.addAttribute("previewsCount", previews.size() - 1);
        return "previews_table";
    }
    
    @RequestMapping(value="/admin/preview/add", method = RequestMethod.GET)
    public String addPreview(Model model) {
        model.addAttribute("action", "add");
        
        return "change_one_preview";
    }
    
    @RequestMapping(value="/admin/preview/add", method = RequestMethod.GET, 
            params = {"id", "title", "description", "text", "event_date", "id_img"})
    public String addPreview(Model model, 
                        @RequestParam(value = "id") String id,
                        @RequestParam(value = "title") String title,
                        @RequestParam(value = "description") String description,
                        @RequestParam(value = "text") String text,
                        @RequestParam(value = "event_date") String eventDate,
                        @RequestParam(value = "id_img") int idImg){
        
        Preview preview = new Preview();
        Factory factory = Factory.getInstance();
        PreviewDao previewDao = factory.getPreviewDao();

        preview.setTitle(title);
        preview.setDescription(description);
        preview.setText(text);
        try {
        preview.setEventDate(new SimpleDateFormat("yyyy-MM-dd").parse(eventDate));
        } catch (ParseException ex) {
            System.out.println("Exception in admin/news/add with param" + ex);
        }
        preview.setIdImg(idImg);

        try {
            previewDao.addPreview(preview);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        return "change_one_preview";
    }
    
    @RequestMapping(value="/admin/preview/change", method = RequestMethod.GET, params = "id")
    public String changePreview(Model model, 
                        @RequestParam(value = "id") int id){
        
        Preview preview = null;
        Factory factory = Factory.getInstance();
        PreviewDao previewDao = factory.getPreviewDao();

        try {
            preview = previewDao.getPreview(id);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        model.addAttribute("preview", preview);
        model.addAttribute("action", "change");
        
        return "change_one_preview";
    }
    
    @RequestMapping(value="/admin/preview/change", method = RequestMethod.GET, 
            params = {"id", "title", "description", "text", "event_date", "id_img"})
    public String changePreview(Model model, 
                        @RequestParam(value = "id") int id,
                        @RequestParam(value = "title") String title,
                        @RequestParam(value = "description") String description,
                        @RequestParam(value = "text") String text,
                        @RequestParam(value = "event_date") String eventDate,
                        @RequestParam(value = "id_img") int idImg){
        
        Preview preview = new Preview();
        Factory factory = Factory.getInstance();
        PreviewDao previewDao = factory.getPreviewDao();
                
        preview.setIdPreview(id);
        preview.setTitle(title);
        preview.setDescription(description);
        preview.setText(text);
        try {
        preview.setEventDate(new SimpleDateFormat("yyyy-MM-dd").parse(eventDate));
        } catch (ParseException ex) {
            System.out.println("Exception in admin/news/change with param" + ex);
        }
        preview.setIdImg(idImg);

        try {
            previewDao.updatePreview(preview);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        return "change_one_preview";
    }
    
    @RequestMapping(value="/admin/preview/del", method = RequestMethod.GET, params = "id")
    public String deletePreview(Model model, @RequestParam(value = "id") int id) {
        
        Factory factory = Factory.getInstance();
        PreviewDao previewDao = factory.getPreviewDao();
                
        try {
            previewDao.deletePreview(id);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        return "aAdmin_page";
    }
    
    @RequestMapping(value="/admin/photo")
    public String viewPhoto() {  
        return "files_upload";
    }
    
    @RequestMapping(value="/admin/photo/add", method = RequestMethod.GET)
    public String viewPhoto(Model model,
            @RequestParam(value = "file[]") String[] files) {  
        System.out.println(Arrays.toString(files));
        return "files_upload";
    }
    
    /**
     * 
     * Video 
     */
    
    @RequestMapping(value="/admin/video", method = RequestMethod.GET)
    public String viewVideo(Model model) { 
        Factory factory = Factory.getInstance();
        
        VideoDao videoDao = factory.getVideoDao();
        
        ArrayList<Video> videos = null;      
        try {
            videos = videoDao.getVideos();
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }   
        model.addAttribute("videos", videos);
        model.addAttribute("videosCount", videos.size() - 1);
        return "videos_table";
    }
    
    @RequestMapping(value="/admin/video/add", method = RequestMethod.GET)
    public String addVideo(Model model) {
        model.addAttribute("action", "add");
        
        return "change_one_video";
    }
    
    @RequestMapping(value="/admin/video/add", method = RequestMethod.GET, 
            params = {"id", "href"})
    public String addVideo(Model model, 
                        @RequestParam(value = "id") int id,
                        @RequestParam(value = "href") String href){
        System.out.println("1111111111111");
        Video video = new Video();
        Factory factory = Factory.getInstance();
        VideoDao videoDao = factory.getVideoDao();

        video.setHref(href);

        try {
            videoDao.addVideo(video);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        return "change_one_video";
    }
    
    @RequestMapping(value="/admin/video/change", method = RequestMethod.GET, params = "id")
    public String changeVideo(Model model, 
                        @RequestParam(value = "id") int id){
        
        Video video = null;
        Factory factory = Factory.getInstance();
        VideoDao videoDao = factory.getVideoDao();

        try {
            video = videoDao.getVideo(id);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        model.addAttribute("video", video);
        model.addAttribute("action", "change");
        
        return "change_one_video";
    }
    
    @RequestMapping(value="/admin/video/change", method = RequestMethod.GET, 
            params = {"id", "href"})
    public String changeVideo(Model model, 
                        @RequestParam(value = "id") int id,
                        @RequestParam(value = "href") String href){
        
        Video video = new Video();
        Factory factory = Factory.getInstance();
        VideoDao videoDao = factory.getVideoDao();
                
        video.setIdVideo(id);
        video.setHref(href);


        try {
            videoDao.updateVideo(video);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        return "change_one_video";
    }
    
    @RequestMapping(value="/admin/video/del", method = RequestMethod.GET, params = "id")
    public String deleteVideo(Model model, @RequestParam(value = "id") int id) {
        
        Factory factory = Factory.getInstance();
        VideoDao videoDao = factory.getVideoDao();
                
        try {
            videoDao.deleteVideo(id);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        return "aAdmin_page";
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