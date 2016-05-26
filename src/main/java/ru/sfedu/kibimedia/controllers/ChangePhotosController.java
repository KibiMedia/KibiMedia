/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 1
 */
@Controller
public class ChangePhotosController {
    @RequestMapping(value="/admins/photo")
    public String viewHome() {  
        return "change_photos";
    }
}
