/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.EventReg;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishas
 */
public interface EventRegDao {
    
    public void addEvent(EventReg event) throws SQLException;
    public void deleteEvent(EventReg event) throws SQLException;
    public void deleteEvent(int id) throws SQLException;
    public EventReg getEvent(int id) throws SQLException;
    public ArrayList<EventReg> getEvents() throws SQLException;
}
