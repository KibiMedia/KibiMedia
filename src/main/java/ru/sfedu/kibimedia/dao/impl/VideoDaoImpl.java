/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import ru.sfedu.kibimedia.dao.VideoDao;
import ru.sfedu.kibimedia.tables.Video;
import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.Session;
import ru.sfedu.kibimedia.utils.HibernateUtils;
/**
 *
 * @author 1
 */
public class VideoDaoImpl implements VideoDao{
    
    @Override
    public void addVideo(Video video) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(video);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }
    
    @Override
    public void updateVideo(Video video) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(video);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteVideo(Video video) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(video);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteVideo(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getVideo(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public Video getVideo(int id) throws SQLException {
        Video video = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            video = (Video) session.load(Video.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return video;
    }

    @Override
    public ArrayList<Video> getVideos() throws SQLException {
        ArrayList<Video> video = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            video = (ArrayList<Video>) session.createCriteria(Video.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return video;
    }
    
}
