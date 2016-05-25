/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import ru.sfedu.kibimedia.dao.ComentsDao;
import ru.sfedu.kibimedia.tables.Coments;
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
public class ComentsDaoImpl implements ComentsDao {

    @Override
    public void addComent(Coments coment) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(coment);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteComent(Coments coment) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(coment);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteComentById(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getComent(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public Coments getComent(int id) throws SQLException {
        Coments coment = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            coment = (Coments) session.load(Coments.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return coment;
    }

    @Override
    public ArrayList<Coments> getComents() throws SQLException {
        ArrayList<Coments> coments = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            coments = (ArrayList<Coments>) session.createCriteria(Coments.class)
                    .addOrder(Order.asc("idNews")).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return coments;
    }
    
    
}
