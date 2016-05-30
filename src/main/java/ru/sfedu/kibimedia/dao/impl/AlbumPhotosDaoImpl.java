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
import ru.sfedu.kibimedia.tables.AlbumsPhoto;
import ru.sfedu.kibimedia.utils.HibernateUtils;

/**
 *
 * @author Сергей
 */
public class AlbumPhotosDaoImpl implements AlbumPhotosDao {

    @Override
    public void addAlbumPhotos(AlbumsPhoto admin) throws SQLException {
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
    public void deleteAlbumPhotos(AlbumsPhoto admin) throws SQLException {
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
    public AlbumsPhoto getPhotoById(int id) throws SQLException {
        AlbumsPhoto albumPhotos = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumPhotos = (AlbumsPhoto) session.load(AlbumsPhoto.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albumPhotos;
    }
    
    @Override
    public ArrayList<AlbumsPhoto> getPhotosByAlbum(int album) throws SQLException {
        ArrayList<AlbumsPhoto> albumPhotoses = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumPhotoses = (ArrayList<AlbumsPhoto>) session.createCriteria(AlbumsPhoto.class)
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
    public ArrayList<AlbumsPhoto> getAllAlbumPhotos() throws SQLException {
        ArrayList<AlbumsPhoto> albumPhotoses = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            albumPhotoses = (ArrayList<AlbumsPhoto>) session.createCriteria(AlbumsPhoto.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return albumPhotoses;
    }  
}
