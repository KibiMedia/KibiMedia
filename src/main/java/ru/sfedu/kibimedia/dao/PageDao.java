/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Page;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishas
 */
public interface PageDao {
    
    public void addPage(Page page) throws SQLException;
    public void deletePage(Page page) throws SQLException;
    public void deletePage(int id) throws SQLException;
    public Page getPage(int id) throws SQLException;
    public ArrayList<Page> getPages() throws SQLException;
    public ArrayList<Page> getPagesByType(int type) throws SQLException;
    
}
