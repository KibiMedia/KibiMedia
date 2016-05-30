/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import ru.sfedu.kibimedia.tables.Awards;
/**
 *
 * @author 1
 */
public interface AwardsDao {
    public void addAward(Awards award) throws SQLException;
    public void deleteAward(Awards award) throws SQLException;
    public void deleteAward(int id) throws SQLException;
    public Awards getAwardById(int id) throws SQLException;
    public ArrayList<Awards> getAwards() throws SQLException;
    
}
