/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import ru.sfedu.kibimedia.tables.Albums;


/**
 *
 * @author Сергей
 */
public interface AlbumsDao {
    
    public void addAlbum(Albums album) throws SQLException;
    public void deleteAlbum(Albums album) throws SQLException;
    public void deleteAlbum(int id) throws SQLException;
    public Albums getAlbumById(int id) throws SQLException;
    public ArrayList<Albums> getAlbums() throws SQLException;
    
}
