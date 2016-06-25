/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import ru.sfedu.kibimedia.dao.PageDao;
import ru.sfedu.kibimedia.tables.Page;
import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import ru.sfedu.kibimedia.utils.HibernateUtils;
/**
 *
 * @author Mishas
 */
public class PageDaoImpl implements PageDao {

    @Override
    public void addPage(Page page) throws SQLException {
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
    public void deletePage(Page page) throws SQLException {
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
    public Page getPage(int id) throws SQLException {
        Page page = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            page = (Page) session.load(Page.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return page;
    }

    @Override
    public ArrayList<Page> getPages() throws SQLException {
        ArrayList<Page> page = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            page = (ArrayList<Page>) session.createCriteria(Page.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return page;
    }
    
    @Override
    public ArrayList<Page> getPagesByType(int type) throws SQLException {
        ArrayList<Page> page = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            page = (ArrayList<Page>) session.createCriteria(Page.class)
                    .add(Restrictions.eq("type", new Integer(type)))
                    .addOrder(Order.asc("idPage"))
                    .list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return page;
    }
    
    
}
