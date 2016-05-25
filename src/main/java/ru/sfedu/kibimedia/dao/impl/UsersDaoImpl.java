/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;

import ru.sfedu.kibimedia.dao.UsersDao;
import ru.sfedu.kibimedia.tables.Users;
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
public class UsersDaoImpl implements UsersDao {

    @Override
    public void addUser(Users user) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteUser(Users user) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteUser(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getUserById(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public Users getUserById(int id) throws SQLException {
        Users user = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            user = (Users) session.load(Users.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return user;
    }

    @Override
    public ArrayList<Users> getUsers() throws SQLException {
        ArrayList<Users> users = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            users = (ArrayList<Users>) session.createCriteria(Users.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return users;
    }

    @Override
    public Users getUserByLoginAndPassword(String login, String pass) throws SQLException {
        ArrayList<Users> users = null;
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            users = (ArrayList<Users>) session.createCriteria(Users.class).add(Restrictions.eq("login", login)).add(Restrictions.eq("password", pass)).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        if (users == null)
            return null;
        
        if (users.isEmpty())
            return null; 
        
        return users.get(0);
    }
    
}
