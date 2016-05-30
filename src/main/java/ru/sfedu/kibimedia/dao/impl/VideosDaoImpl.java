/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import ru.sfedu.kibimedia.dao.VideosDao;
import ru.sfedu.kibimedia.tables.Videos;
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
public class VideosDaoImpl implements VideosDao{
    
    @Override
    public void addVideo(Videos video) throws SQLException {
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
    public void deleteVideo(Videos video) throws SQLException {
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
    public void deleteVideoById(int id) throws SQLException {
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
    public Videos getVideo(int id) throws SQLException {
        Videos video = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            video = (Videos) session.load(Videos.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return video;
    }

    @Override
    public ArrayList<Videos> getVideos() throws SQLException {
        ArrayList<Videos> videos = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            videos = (ArrayList<Videos>) session.createCriteria(Videos.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return videos;
    }
    
}
