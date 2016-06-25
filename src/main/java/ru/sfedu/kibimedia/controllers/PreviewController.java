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
import ru.sfedu.kibimedia.dao.PreviewDao;
import ru.sfedu.kibimedia.dao.PageDao;
import ru.sfedu.kibimedia.dao.PhotoDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Preview;
import ru.sfedu.kibimedia.tables.Page;
import ru.sfedu.kibimedia.tables.Photo;

/**
 *
 * @author Сергей
 */
@Controller
public class PreviewController {
    @RequestMapping(value="/preview", method = RequestMethod.GET)
    public String viewHome(Model model) {  
        Factory factory = Factory.getInstance();
        PageDao pageDao = factory.getPageDao();
        PreviewDao previewDao = factory.getPreviewDao();
        PhotoDao photoDao = factory.getPhotoDao();
        
        ArrayList<Preview> previewes = null;
        ArrayList<Photo> previewPhoto = new ArrayList<>();
        ArrayList<Page> mainPages = null;
        ArrayList<Page> footerPages = null;

        try {
            mainPages = pageDao.getPagesByType(0);
            footerPages = pageDao.getPagesByType(2);
            
            previewes = previewDao.getPreviews();
            for (int i = 0; i < previewes.size(); ++i) 
                previewPhoto.add(photoDao.getPhoto(previewes.get(i).getIdImg()));
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        model.addAttribute("previews", previewes);
        model.addAttribute("previewsCount", previewes.size() - 1);
        model.addAttribute("previewsPhoto", previewPhoto);
        
        return "previews";
    } 

    @RequestMapping(value="/preview", method = RequestMethod.GET, params = "id")
    public String viewHomeWithId(Model model, @RequestParam(value = "id") int id) {
        Factory factory = Factory.getInstance();
        PageDao pageDao = factory.getPageDao();
        PreviewDao previewDao = factory.getPreviewDao();
        
        Preview preview = null;
        ArrayList<Page> mainPages = null;
        ArrayList<Page> footerPages = null;

        try {
            mainPages = pageDao.getPagesByType(0);
            footerPages = pageDao.getPagesByType(2);
            preview = previewDao.getPreview(id);
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        model.addAttribute("preview", preview);
        return "one_preview";
    }
       
}
