/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import ru.sfedu.kibimedia.dao.AlbumPhotosDao;
import ru.sfedu.kibimedia.tables.AlbumPhotos;
import ru.sfedu.kibimedia.utils.HibernateUtils;

/**
 *
 * @author Сергей
 */
public class AlbumPhotosDaoImpl implements AlbumPhotosDao {

    @Override
    public void addAlbumPhotos(AlbumPhotos admin) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(admin);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteAlbumPhotos(AlbumPhotos admin) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(admin);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteAlbumPhotos(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getPhotoById(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }
    
    @Override
    public AlbumPhotos getPhotoById(int id) throws SQLException {
        AlbumPhotos albumPhotos = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumPhotos = (AlbumPhotos) session.load(AlbumPhotos.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albumPhotos;
    }
    
    @Override
    public ArrayList<AlbumPhotos> getPhotosByAlbum(int album) throws SQLException {
        ArrayList<AlbumPhotos> albumPhotoses = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumPhotoses = (ArrayList<AlbumPhotos>) session.createCriteria(AlbumPhotos.class)
                    .add(Restrictions.eq("idAlbum", new Integer(album))).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albumPhotoses;
    }

    @Override
    public ArrayList<AlbumPhotos> getAllAlbumPhotos() throws SQLException {
        ArrayList<AlbumPhotos> albumPhotoses = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumPhotoses = (ArrayList<AlbumPhotos>) session.createCriteria(AlbumPhotos.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albumPhotoses;
    }  
}
