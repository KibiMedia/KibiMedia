/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import ru.sfedu.kibimedia.tables.Album;


/**
 *
 * @author Сергей
 */
public interface AlbumDao {
    
    public void addAlbum(Album album) throws SQLException;
    public void deleteAlbum(Album album) throws SQLException;
    public void deleteAlbum(int id) throws SQLException;
    public Album getAlbumById(int id) throws SQLException;
    public ArrayList<Album> getAlbum() throws SQLException;
    
}
