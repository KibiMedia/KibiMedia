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
    
    public void addPhotos(Photos photos) throws SQLException;
    public void deletePhotos(Photos photos) throws SQLException;
    public void deletePhotos(int id) throws SQLException;
    public Photos getPhotos(int id) throws SQLException;
    public ArrayList<Photos> getAllPhotos() throws SQLException;
}
