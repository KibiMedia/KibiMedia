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
import ru.sfedu.kibimedia.dao.PagesDao;
import ru.sfedu.kibimedia.dao.PhotosDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Preview;
import ru.sfedu.kibimedia.tables.Pages;
import ru.sfedu.kibimedia.tables.Photos;

/**
 *
 * @author Сергей
 */
@Controller
public class PreviewController {
    @RequestMapping(value="/previews", method = RequestMethod.GET)
    public String viewHome(Model model) {  
        Factory factory = Factory.getInstance();
        PagesDao pagesDao = factory.getPagesDao();
        PreviewDao previewDao = factory.getPreviewDao();
        PhotosDao photosDao = factory.getPhotosDao();
        
        ArrayList<Preview> previewes = null;
        ArrayList<Photos> previewPhotos = new ArrayList<>();
        ArrayList<Pages> mainPages = null;
        ArrayList<Pages> footerPages = null;

        try {
            mainPages = pagesDao.getPagesByType(0);
            footerPages = pagesDao.getPagesByType(2);
            
            previewes = previewDao.getPreviews();
            for (int i = 0; i < previewes.size(); ++i) 
                previewPhotos.add(photosDao.getPhoto(previewes.get(i).getIdImg()));
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
        model.addAttribute("previewsPhotos", previewPhotos);
        
        return "previews";
    } 

    @RequestMapping(value="/previews", method = RequestMethod.GET, params = "id")
    public String viewHomeWithId(Model model, @RequestParam(value = "id") int id) {
        Factory factory = Factory.getInstance();
        PagesDao pagesDao = factory.getPagesDao();
        PreviewDao previewDao = factory.getPreviewDao();
        
        Preview preview = null;
        ArrayList<Pages> mainPages = null;
        ArrayList<Pages> footerPages = null;

        try {
            mainPages = pagesDao.getPagesByType(0);
            footerPages = pagesDao.getPagesByType(2);
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
