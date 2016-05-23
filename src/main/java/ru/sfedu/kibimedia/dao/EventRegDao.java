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
    
    public void addEventReg(EventReg eventReg) throws SQLException;
    public void deleteEventReg(EventReg eventReg) throws SQLException;
    public void deleteEventReg(int id) throws SQLException;
    public EventReg getEventReg(int id) throws SQLException;
    public ArrayList<EventReg> getAllEventReg() throws SQLException;
}
