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
import ru.sfedu.kibimedia.tables.AlbumPhoto;
import ru.sfedu.kibimedia.utils.HibernateUtils;
import ru.sfedu.kibimedia.dao.AlbumPhotoDao;

/**
 *
 * @author Сергей
 */
public class AlbumPhotoDaoImpl implements AlbumPhotoDao {

    @Override
    public void addAlbumPhoto(AlbumPhoto albumPhoto) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(albumPhoto);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteAlbumPhoto(AlbumPhoto albumPhoto) throws SQLException {

        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(albumPhoto);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteAlbumPhoto(int id) throws SQLException {
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
    public AlbumPhoto getPhotoById(int id) throws SQLException {
        AlbumPhoto albumPhoto = null;

        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumPhoto = (AlbumPhoto) session.load(AlbumPhoto.class, id);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albumPhoto;
    }
    
    @Override
    public ArrayList<AlbumPhoto> getPhotosByAlbum(int album) throws SQLException {
        ArrayList<AlbumPhoto> albumPhotos = null;

        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumPhotos = (ArrayList<AlbumPhoto>) session.createCriteria(AlbumPhoto.class)
                    .add(Restrictions.eq("idAlbum", new Integer(album))).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albumPhotos;
    }

    @Override
    public ArrayList<AlbumPhoto> getAllAlbumPhoto() throws SQLException {
        ArrayList<AlbumPhoto> albumPhotos = null;

        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumPhotos = (ArrayList<AlbumPhoto>) session.createCriteria(AlbumPhoto.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albumPhotos;
    }  
}
