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
 * @author DPosadsky
 */
@Controller
public class ContactsController {
    
    @RequestMapping(value="/contacts", method = RequestMethod.GET)
    public String viewHome(Model model) {
        Factory factory = Factory.getInstance();
        NewsDao newsDao = factory.getNewsDao();
        ArrayList<News> sixNews = null;
        try {
            sixNews = newsDao.getLastSixNews(); 
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
 
        
        model.addAttribute("mainTitle", "Киби медиа центр");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("imgUrl", "resources/images/page-1_img4.jpg");
 

        return "contacts";
    }
    /*
    @RequestMapping(value="/home", method = RequestMethod.GET, params = "newPar")
    public String viewHomeWithParams() {
        System.out.println("newPar");
        return "home";
    }
    */

}
