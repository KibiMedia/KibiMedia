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
import ru.sfedu.kibimedia.dao.PreviewDao;
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.dao.PageDao;
import ru.sfedu.kibimedia.dao.PhotoDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Preview;
import ru.sfedu.kibimedia.tables.News;
import ru.sfedu.kibimedia.tables.Page;
import ru.sfedu.kibimedia.tables.Photo;

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
        PreviewDao previewDao = factory.getPreviewDao();
        PhotoDao photoDao = factory.getPhotoDao();
        PageDao pageDao = factory.getPageDao();
        
        ArrayList<News> sixNews = null;
        ArrayList<Preview> previews = null;
        ArrayList<Page> mainPages = null;
        ArrayList<Page> footerPages = null;
        ArrayList<Page> topPages = null;
        ArrayList<Photo> newsPhotos = new ArrayList<>();
        ArrayList<Photo> previewPhotos = new ArrayList<>();
        try {
            sixNews = newsDao.getLastSixNews(); 
            for (int i = 0; i < 6; ++i) {
                newsPhotos.add(photoDao.getPhoto(sixNews.get(i).getIdImg()));
            }
            previews = previewDao.getPreviews();
            for (int i = 0; i < previews.size(); ++i) {
                previewPhotos.add(photoDao.getPhoto(previews.get(i).getIdImg()));
            }
            mainPages = pageDao.getPagesByType(0);
            footerPages = pageDao.getPagesByType(2);
            topPages = pageDao.getPagesByType(1);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }       
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("imgUrl", "resources/images/page-1_img4.jpg");
        model.addAttribute("news", sixNews);
        model.addAttribute("newsPhotos", newsPhotos);
        model.addAttribute("previews", previews);
        model.addAttribute("previewsCount", previews.size() - 1);
        model.addAttribute("previewPhotos", previewPhotos);
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        model.addAttribute("topPages", topPages);
        model.addAttribute("topPagesCount", topPages.size() - 1);
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
