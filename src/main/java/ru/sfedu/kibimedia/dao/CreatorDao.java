/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Creator;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author 1
 */
public interface CreatorDao {
    
    public void addCreator(Creator creator) throws SQLException;
    public void deleteCreator(Creator creator) throws SQLException;
    public void deleteCreatorById(int id) throws SQLException;
    public Creator getCreator(int id) throws SQLException;
    public ArrayList<Creator> getCreator() throws SQLException;
}
