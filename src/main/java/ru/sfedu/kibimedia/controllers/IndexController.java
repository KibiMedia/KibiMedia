/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.controllers;

import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.News;
import ru.sfedu.kibimedia.utils.Settings;

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
        News news = null;
        try {
            news = newsDao.getNews(1); 
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ Медиа Центр ЮФУ");
        model.addAttribute("sfeduLogo", Settings.projectName + "/resources/images/sfedu_logo.png");
        model.addAttribute("imgUrl", Settings.projectName + "/resources/images/page-1_img4.jpg");
        model.addAttribute("description", news.getMainIdea());
        model.addAttribute("title", news.getTitle());
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
