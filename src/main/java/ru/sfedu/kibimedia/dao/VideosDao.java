/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Videos;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author 1
 */
public interface VideosDao {
    
    public void addVideo(Videos video) throws SQLException;
    public void deleteVideo(Videos video) throws SQLException;
    public void deleteVideoById(int id) throws SQLException;
    public Videos getVideo(int id) throws SQLException;
    public ArrayList<Videos> getVideos() throws SQLException;
}
