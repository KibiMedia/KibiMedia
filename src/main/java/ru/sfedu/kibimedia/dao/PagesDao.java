/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Pages;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishas
 */
public interface PagesDao {
    
    public void addPages(Pages pages) throws SQLException;
    public void deletePages(Pages pages) throws SQLException;
    public void deletePages(int id) throws SQLException;
    public Pages getPages(int id) throws SQLException;
    public ArrayList<Pages> getAllPages() throws SQLException;
}
