/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author DPosadsky
 */
@Controller
public class IndexController {
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String viewHome(Model model) {
        model.addAttribute("news", Integer.valueOf(5));
        return "index";
    }
    
    @RequestMapping(value="/home", method = RequestMethod.GET, params = "newPar")
    public String viewHomeWithParams() {
        System.out.println("newPar");
        return "home";
    }
    
}
