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
public interface AlbumPhotosDao {
    
    public void addAlbumPhotos(AlbumsPhoto albumPhotos) throws SQLException;
    public void deleteAlbumPhotos(AlbumsPhoto albumPhotos) throws SQLException;
    public void deleteAlbumPhotos(int id) throws SQLException;
    public AlbumsPhoto getPhotoById(int id) throws SQLException;
    public ArrayList<AlbumsPhoto> getPhotosByAlbum(int album) throws SQLException;
    public ArrayList<AlbumsPhoto> getAllAlbumPhotos() throws SQLException;
    
}
