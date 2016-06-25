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
import ru.sfedu.kibimedia.dao.EmployeeDao;
import ru.sfedu.kibimedia.dao.PageDao;
import ru.sfedu.kibimedia.main.Factory;
import ru.sfedu.kibimedia.tables.Employee;
import ru.sfedu.kibimedia.tables.Page;

/**
 *
 * @author DPosadsky
 */
@Controller
public class ContactController {
    @RequestMapping(value="/contacts", method = RequestMethod.GET)
    public String viewHome(Model model) {  
        Factory factory = Factory.getInstance();
        PageDao pageDao = factory.getPageDao();
        EmployeeDao employeeDao = factory.getEmployeeDao();
        
        ArrayList<Page> mainPages = null;
        ArrayList<Page> footerPages = null;
        ArrayList<Employee> employee = null;
        //Employee employee = null;
        try {
            mainPages = pageDao.getPagesByType(0);
            footerPages = pageDao.getPagesByType(2);
            employee = employeeDao.getEmployee();
        } catch (SQLException ex) {
            System.out.println("Exception in getDocumentation in Controller: " + ex);
        }
        
        //System.out.println(employee.getFullName());
        
        model.addAttribute("mainTitle", "КИБИ МЕДИА ЦЕНТР ЮФУ");
        model.addAttribute("sfeduLogo", "resources/images/sfedu_logo.png");
        model.addAttribute("mainPages", mainPages);
        model.addAttribute("mainPagesCount", mainPages.size() - 1);
        model.addAttribute("footerPages", footerPages);
        model.addAttribute("footerPagesCount", footerPages.size() - 1);
        model.addAttribute("employee", employee);
        //model.addAttribute("employeeCount", employee.size()-1);
        
        return "contacts";
    }
        
}
