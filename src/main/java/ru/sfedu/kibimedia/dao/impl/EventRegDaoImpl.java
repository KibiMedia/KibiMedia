/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import ru.sfedu.kibimedia.dao.EventRegDao;
import ru.sfedu.kibimedia.tables.EventReg;
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
public class EventRegDaoImpl implements EventRegDao {

    @Override
    public void addEventReg(EventReg eventReg) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(eventReg);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteEventReg(EventReg eventReg) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(eventReg);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteEventReg(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getEventReg(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public EventReg getEventReg(int id) throws SQLException {
        EventReg eventReg = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            eventReg = (EventReg) session.load(EventReg.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return eventReg;
    }

    @Override
    public ArrayList<EventReg> getAllEventReg() throws SQLException {
        ArrayList<EventReg> allEventReg = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            allEventReg = (ArrayList<EventReg>) session.createCriteria(EventReg.class)
                    .addOrder(Order.asc("eventRegNumber")).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return allEventReg;
    }

    
}
