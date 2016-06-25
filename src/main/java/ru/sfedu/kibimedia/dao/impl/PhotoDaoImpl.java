/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import ru.sfedu.kibimedia.dao.PhotoDao;
import ru.sfedu.kibimedia.tables.Photo;
import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.Session;
import ru.sfedu.kibimedia.utils.HibernateUtils;
/**
 *
 * @author Mishas
 */
public class PhotoDaoImpl implements PhotoDao {

    @Override
    public void addPhoto(Photo photo) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(photo);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deletePhoto(Photo photo) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(photo);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deletePhoto(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getPhoto(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public Photo getPhoto(int id) throws SQLException {
        Photo photo = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            photo = (Photo) session.load(Photo.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return photo;
    }

    @Override
    public ArrayList<Photo> getPhotos() throws SQLException {
        ArrayList<Photo> photo = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            photo = (ArrayList<Photo>) session.createCriteria(Photo.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return photo;
    }
    
    
}
