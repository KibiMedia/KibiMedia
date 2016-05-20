/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.News;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishas
 */
public interface NewsDao {
    
    public void addNews(News task) throws SQLException;
    public void deleteNews(News task) throws SQLException;
    public void deleteNews(int id) throws SQLException;
    public News getNews(int id) throws SQLException;
    public ArrayList<News> getAllNews() throws SQLException;
}
