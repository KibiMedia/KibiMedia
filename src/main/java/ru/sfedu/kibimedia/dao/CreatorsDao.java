/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Creators;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author 1
 */
public interface CreatorsDao {
    
    public void addCreator(Creators creator) throws SQLException;
    public void deleteCreator(Creators creator) throws SQLException;
    public void deleteCreatorById(int id) throws SQLException;
    public Creators getCreator(int id) throws SQLException;
    public ArrayList<Creators> getCreators() throws SQLException;
}
