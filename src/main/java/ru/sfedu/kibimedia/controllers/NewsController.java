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
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.dao.PagesDao;
import ru.sfedu.kibimedia.dao.PhotosDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.News;
import ru.sfedu.kibimedia.tables.Pages;
import ru.sfedu.kibimedia.tables.Photos;

/**
 *
 * @author Сергей
 */
@Controller
public class NewsController {
    @RequestMapping(value="/news", method = RequestMethod.GET)
    public String viewHome(Model model) {  
        Factory factory = Factory.getInstance();
        PagesDao pagesDao = factory.getPagesDao();
        NewsDao newsDao = factory.getNewsDao();
        PhotosDao photosDao = factory.getPhotosDao();
        
        ArrayList<News> news = null;
        ArrayList<Photos> newsPhotos = new ArrayList<>();
        ArrayList<Pages> mainPages = null;
        ArrayList<Pages> footerPages = null;

        try {
            mainPages = pagesDao.getPagesByType(0);
            footerPages = pagesDao.getPagesByType(2);
            
            news = newsDao.getAllNews();
            for (int i = 0; i < news.size(); ++i) 
                newsPhotos.add(photosDao.getPhoto(news.get(i).getIdImg()));
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        model.addAttribute("news", news);
        model.addAttribute("newsCount", news.size() - 1);
        model.addAttribute("newsPhotos", newsPhotos);
        
        return "news";
    } 

    @RequestMapping(value="/news", method = RequestMethod.GET, params = "id")
    public String viewHomeWithId(Model model, @RequestParam(value = "id") int id) {
        Factory factory = Factory.getInstance();
        PagesDao pagesDao = factory.getPagesDao();
        NewsDao newsDao = factory.getNewsDao();
        PhotosDao photosDao = factory.getPhotosDao();
        
        News news = null;
        ArrayList<Pages> mainPages = null;
        ArrayList<Pages> footerPages = null;
        Photos newsPhoto = null;

        try {
            mainPages = pagesDao.getPagesByType(0);
            footerPages = pagesDao.getPagesByType(2);
            news = newsDao.getNews(id);
            newsPhoto = photosDao.getPhoto(news.getIdImg());
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        model.addAttribute("news", news);
        model.addAttribute("newsPhoto", newsPhoto);
        return "one_news";
    }
    
}
