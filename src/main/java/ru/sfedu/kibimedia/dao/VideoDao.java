/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Video;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author 1
 */
public interface VideoDao {
    
    public void addVideo(Video video) throws SQLException;
    public void updateVideo(Video video) throws SQLException;
    public void deleteVideo(Video video) throws SQLException;
    public void deleteVideo(int id) throws SQLException;
    public Video getVideo(int id) throws SQLException;
    public ArrayList<Video> getVideos() throws SQLException;
}
