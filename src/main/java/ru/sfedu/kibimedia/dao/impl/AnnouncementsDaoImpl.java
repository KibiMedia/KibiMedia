/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import ru.sfedu.kibimedia.dao.AnnouncementsDao;
import ru.sfedu.kibimedia.tables.Announcements;
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
public class AnnouncementsDaoImpl implements AnnouncementsDao {

    @Override
    public void addAnnouncements(Announcements announcement) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(announcement);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteAnnouncements(Announcements announcement) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(announcement);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteAnnouncements(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getAnnouncements(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public Announcements getAnnouncements(int id) throws SQLException {
        Announcements announcement = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            announcement = (Announcements) session.load(Announcements.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return announcement;
    }

    @Override
    public ArrayList<Announcements> getAllAnnouncements() throws SQLException {
        ArrayList<Announcements> allAnnouncements = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            allAnnouncements = (ArrayList<Announcements>) session.createCriteria(Announcements.class)
                    .addOrder(Order.asc("announcementNumber")).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return allAnnouncements;
    }
    
    
}
