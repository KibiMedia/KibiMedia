/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Admins;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mishas
 */
public interface AdminsDao {
    
    public void addAdmin(Admins admin) throws SQLException;
    public void deleteAdmin(Admins admin) throws SQLException;
    public void deleteAdmin(int id) throws SQLException;
    public Admins getAdminById(int id) throws SQLException;
    public ArrayList<Admins> getAdmins() throws SQLException;
}
