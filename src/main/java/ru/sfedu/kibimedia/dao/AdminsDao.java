/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Admins;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishas
 */
public interface AdminsDao {
    
    public void addAdmins(Admins admins) throws SQLException;
    public void deleteAdmins(Admins admins) throws SQLException;
    public void deleteAdmins(int id) throws SQLException;
    public Admins getAdmins(int id) throws SQLException;
    public ArrayList<Admins> getAllAdmins() throws SQLException;
}
