/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Photo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mishas
 */
public interface PhotoDao {
    
    public void addPhoto(Photo photo) throws SQLException;
    public void deletePhoto(Photo photo) throws SQLException;
    public void deletePhoto(int id) throws SQLException;
    public Photo getPhoto(int id) throws SQLException;
    public ArrayList<Photo> getPhotos() throws SQLException;
}
