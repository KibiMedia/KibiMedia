/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Announcements;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishas
 */
public interface AnnouncementsDao {
    
    public void addAnnouncement(Announcements announcement) throws SQLException;
    public void deleteAnnouncement(Announcements announcement) throws SQLException;
    public void deleteAnnouncement(int id) throws SQLException;
    public Announcements getAnnouncement(int id) throws SQLException;
    public ArrayList<Announcements> getAnnouncements() throws SQLException;
    
}
