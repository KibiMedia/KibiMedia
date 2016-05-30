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
import ru.sfedu.kibimedia.dao.AlbumsPhotoDao;
import ru.sfedu.kibimedia.tables.AlbumsPhoto;
import ru.sfedu.kibimedia.utils.HibernateUtils;

/**
 *
 * @author Сергей
 */
public class AlbumsPhotoDaoImpl implements AlbumsPhotoDao {

    @Override
    public void addAlbumsPhoto(AlbumsPhoto albumsPhoto) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(albumsPhoto);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteAlbumsPhoto(AlbumsPhoto albumsPhoto) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(albumsPhoto);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteAlbumsPhoto(int id) throws SQLException {
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
    public AlbumsPhoto getPhotoById(int id) throws SQLException {
        AlbumsPhoto albumsPhoto = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumsPhoto = (AlbumsPhoto) session.load(AlbumsPhoto.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albumsPhoto;
    }
    
    @Override
    public ArrayList<AlbumsPhoto> getPhotosByAlbum(int album) throws SQLException {
        ArrayList<AlbumsPhoto> albumsPhotos = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumsPhotos = (ArrayList<AlbumsPhoto>) session.createCriteria(AlbumsPhoto.class)
                    .add(Restrictions.eq("idAlbum", new Integer(album))).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albumsPhotos;
    }

    @Override
    public ArrayList<AlbumsPhoto> getAllAlbumsPhoto() throws SQLException {
        ArrayList<AlbumsPhoto> albumsPhotos = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumsPhotos = (ArrayList<AlbumsPhoto>) session.createCriteria(AlbumsPhoto.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albumsPhotos;
    }  
}
