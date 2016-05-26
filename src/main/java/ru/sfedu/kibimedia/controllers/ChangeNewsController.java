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
import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.News;

/**
 *
 * @author 1
 */
@Controller
public class ChangeNewsController {
    @RequestMapping(value="/admins/news", method = RequestMethod.GET)
    public String viewHome(Model model) { 
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
}