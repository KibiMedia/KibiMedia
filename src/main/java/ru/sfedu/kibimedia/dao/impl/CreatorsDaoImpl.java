/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import ru.sfedu.kibimedia.dao.CreatorsDao;
import ru.sfedu.kibimedia.tables.Creators;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import ru.sfedu.kibimedia.utils.HibernateUtils;
/**
 *
 * @author 1
 */
public class CreatorsDaoImpl implements CreatorsDao{
    
    @Override
    public void addCreator(Creators creator) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(creator);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteCreator(Creators creator) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(creator);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteCreatorById(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getCreator(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public Creators getCreator(int id) throws SQLException {
        Creators creator = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            creator = (Creators) session.load(Creators.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return creator;
    }

    @Override
    public ArrayList<Creators> getCreators() throws SQLException {
        ArrayList<Creators> creators = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            creators = (ArrayList<Creators>) session.createCriteria(Creators.class)
                    .addOrder(Order.asc("idCreator")).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return creators;
    }
    
    
}
