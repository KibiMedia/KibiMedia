/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.Session;
import ru.sfedu.kibimedia.dao.AlbumDao;
import ru.sfedu.kibimedia.tables.Album;
import ru.sfedu.kibimedia.utils.HibernateUtils;

/**
 *
 * @author Сергей
 */
public class AlbumDaoImpl implements AlbumDao {

    @Override
    public void addAlbum(Album album) throws SQLException {
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
    public void deleteAlbum(Album album) throws SQLException {
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
    public Album getAlbumById(int id) throws SQLException {
        Album album = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            album = (Album) session.load(Album.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return album;
    }

    @Override
    public ArrayList<Album> getAlbum() throws SQLException {
        ArrayList<Album> album = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            album = (ArrayList<Album>) session.createCriteria(Album.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return album;
    }
}
