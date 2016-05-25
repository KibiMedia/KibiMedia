/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import ru.sfedu.kibimedia.dao.NewsDao;
import ru.sfedu.kibimedia.tables.News;
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
public class NewsDaoImpl implements NewsDao {

    @Override
    public void addNews(News news) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(news);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteNews(News news) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(news);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteNews(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getNews(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public News getNews(int id) throws SQLException {
        News news = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            news = (News) session.load(News.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return news;
    }

    @Override
    public ArrayList<News> getAllNews() throws SQLException {
        ArrayList<News> allNews = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            allNews = (ArrayList<News>) session.createCriteria(News.class)
                    .addOrder(Order.desc("eventDate")).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return allNews;
    }
    
    @Override
    public ArrayList<News> getLastSixNews() throws SQLException {
        ArrayList<News> allNews = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            allNews = (ArrayList<News>) session.createCriteria(News.class)
                    .addOrder(Order.desc("data")).setMaxResults(6).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return allNews;
    }
    
    
}
