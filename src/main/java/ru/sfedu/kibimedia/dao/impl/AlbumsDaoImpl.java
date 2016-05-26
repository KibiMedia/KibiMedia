/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.Session;
import ru.sfedu.kibimedia.dao.AlbumsDao;
import ru.sfedu.kibimedia.tables.Albums;
import ru.sfedu.kibimedia.utils.HibernateUtils;

/**
 *
 * @author Сергей
 */
public class AlbumsDaoImpl implements AlbumsDao {

    @Override
    public void addAlbum(Albums album) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(album);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteAlbum(Albums album) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(album);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteAlbum(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getAlbumById(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public Albums getAlbumById(int id) throws SQLException {
        Albums album = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            album = (Albums) session.load(Albums.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return album;
    }

    @Override
    public ArrayList<Albums> getAlbums() throws SQLException {
        ArrayList<Albums> albums = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albums = (ArrayList<Albums>) session.createCriteria(Albums.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albums;
    }
}
