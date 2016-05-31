/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao.impl;


import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import ru.sfedu.kibimedia.dao.EmployeeDao;
import ru.sfedu.kibimedia.tables.Employee;
import ru.sfedu.kibimedia.utils.HibernateUtils;
/**
 *
 * @author 1
 */
public class EmployeeDaoImpl implements EmployeeDao{
    
    @Override
    public void addEmployee(Employee employee) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteEmployee(Employee employee) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public void deleteEmployeeById(int id) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(getEmployee(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
    }

    @Override
    public Employee getEmployee(int id) throws SQLException {
        Employee employee = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            employee = (Employee) session.load(Employee.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }        
        return employee;
    }

    @Override
    public ArrayList<Employee> getEmployee() throws SQLException {
        ArrayList<Employee> employee = null;
        
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            employee = (ArrayList<Employee>) session.createCriteria(Employee.class)
                    .addOrder(Order.asc("idEmployee")).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))
                session.close();
        }
        
        return employee;
    }
    
    
}
