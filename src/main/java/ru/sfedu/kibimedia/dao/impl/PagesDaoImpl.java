/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import ru.sfedu.kibimedia.dao.PagesDao;
import ru.sfedu.kibimedia.tables.Pages;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import ru.sfedu.kibimedia.utils.HibernateUtils;
/**
 *
 * @author Mishas
 */
public class PagesDaoImpl implements PagesDao {

    @Override
    public void addPage(Pages page) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(page);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deletePage(Pages page) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(page);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deletePage(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getPage(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public Pages getPage(int id) throws SQLException {
        Pages page = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            page = (Pages) session.load(Pages.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return page;
    }

    @Override
    public ArrayList<Pages> getPages() throws SQLException {
        ArrayList<Pages> pages = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            pages = (ArrayList<Pages>) session.createCriteria(Pages.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return pages;
    }
    
    @Override
    public ArrayList<Pages> getPagesByType(int type) throws SQLException {
        ArrayList<Pages> pages = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            pages = (ArrayList<Pages>) session.createCriteria(Pages.class)
                    .add(Restrictions.eq("type", new Integer(type)))
                    .addOrder(Order.asc("idPage"))
                    .list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return pages;
    }
    
    
}
