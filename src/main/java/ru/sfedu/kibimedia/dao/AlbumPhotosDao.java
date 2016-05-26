/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import ru.sfedu.kibimedia.tables.AlbumPhotos;

/**
 *
 * @author Сергей
 */
public interface AlbumPhotosDao {
    
    public void addAlbumPhotos(AlbumPhotos albumPhotos) throws SQLException;
    public void deleteAlbumPhotos(AlbumPhotos albumPhotos) throws SQLException;
    public void deleteAlbumPhotos(int id) throws SQLException;
    public AlbumPhotos getPhotoById(int id) throws SQLException;
    public ArrayList<AlbumPhotos> getPhotosByAlbum(int album) throws SQLException;
    public ArrayList<AlbumPhotos> getAllAlbumPhotos() throws SQLException;
    
}
