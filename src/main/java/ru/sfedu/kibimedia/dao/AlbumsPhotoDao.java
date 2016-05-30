/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import ru.sfedu.kibimedia.tables.AlbumsPhoto;

/**
 *
 * @author Сергей
 */
public interface AlbumsPhotoDao {
    
    public void addAlbumsPhoto(AlbumsPhoto albumsPhoto) throws SQLException;
    public void deleteAlbumsPhoto(AlbumsPhoto albumsPhoto) throws SQLException;
    public void deleteAlbumsPhoto(int id) throws SQLException;
    public AlbumsPhoto getPhotoById(int id) throws SQLException;
    public ArrayList<AlbumsPhoto> getPhotosByAlbum(int album) throws SQLException;
    public ArrayList<AlbumsPhoto> getAllAlbumsPhoto() throws SQLException;
    
}
