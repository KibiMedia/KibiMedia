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

import ru.sfedu.kibimedia.dao.EventRegDao;
import ru.sfedu.kibimedia.dao.PagesDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.EventReg;
import ru.sfedu.kibimedia.tables.Pages;


/**
 *
 * @author 1
 */
@Controller
public class EventRegController {
    @RequestMapping(value="/event_reg", method = RequestMethod.GET)
    public String viewHome(Model model) {  
        Factory factory = Factory.getInstance();
        PagesDao pagesDao = factory.getPagesDao();
        
        ArrayList<Pages> mainPages = null;
        ArrayList<Pages> footerPages = null;

        try {
            mainPages = pagesDao.getPagesByType(0);
            footerPages = pagesDao.getPagesByType(2);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        
        return "event_reg";
    }
    
    @RequestMapping(value="/event_reg", method = RequestMethod.GET, params = 
            {"org_name", "event_name", "description", "phone", "full_name" })
    public String viewHomeWithId(Model model, 
            @RequestParam(value = "org_name") String orgName, 
            @RequestParam(value = "event_name") String eventName, 
            @RequestParam(value = "description") String description,
            @RequestParam(value = "phone") String phone,
            @RequestParam(value = "full_name") String fullName)
            {
        Factory factory = Factory.getInstance();    
        PagesDao pagesDao = factory.getPagesDao();
        EventRegDao eventRegDao = factory.getEventRegDao();
        
        
        ArrayList<Pages> mainPages = null;
        ArrayList<Pages> footerPages = null;
        
        EventReg event = new EventReg();            
        
        event.setOrgName(orgName);
        event.setEventName(eventName);
        event.setDescription(description);
        event.setPhone(phone);
        event.setFullName(fullName);
       
        try {
            mainPages = pagesDao.getPagesByType(0);
            footerPages = pagesDao.getPagesByType(2);       
            eventRegDao.addEvent(event);
            
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);        
        return "event_reg";
    }
    
}