/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import ru.sfedu.kibimedia.tables.AlbumPhoto;

/**
 *
 * @author Сергей
 */
public interface AlbumPhotoDao {
    
    public void addAlbumPhoto(AlbumPhoto albumPhoto) throws SQLException;
    public void deleteAlbumPhoto(AlbumPhoto albumPhoto) throws SQLException;
    public void deleteAlbumPhoto(int id) throws SQLException;
    public AlbumPhoto getPhotoById(int id) throws SQLException;
    public ArrayList<AlbumPhoto> getPhotosByAlbum(int album) throws SQLException;
    public ArrayList<AlbumPhoto> getAllAlbumPhoto() throws SQLException;
    
}
