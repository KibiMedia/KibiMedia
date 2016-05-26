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
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Announcements;

/**
 *
 * @author 1
 */
@Controller
public class ChangeAnnouncementController {
@RequestMapping(value="/admins/ann", method = RequestMethod.GET)
    public String viewHome(Model model) { 
        Factory factory = Factory.getInstance();
        
        AnnouncementsDao announcementsDao = factory.getAnnouncementsDao();
        
        ArrayList<Announcements> announcements = null;
        
        try {
            announcements = announcementsDao.getAnnouncements();
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }   
        
        model.addAttribute("announcements", announcements);  
        return "announ_table";
    }
}
