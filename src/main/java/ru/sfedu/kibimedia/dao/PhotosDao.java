/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Photos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishas
 */
public interface PhotosDao {
    
    public void addPhoto(Photos photo) throws SQLException;
    public void deletePhoto(Photos photo) throws SQLException;
    public void deletePhoto(int id) throws SQLException;
    public Photos getPhoto(int id) throws SQLException;
    public ArrayList<Photos> getPhotos() throws SQLException;
}
