/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Admin;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mishas
 */
public interface AdminDao {
    
    public void addAdmin(Admin admin) throws SQLException;
    public void deleteAdmin(Admin admin) throws SQLException;
    public void deleteAdmin(int id) throws SQLException;
    public Admin getAdminById(int id) throws SQLException;
    public ArrayList<Admin> getAdmins() throws SQLException;
}
