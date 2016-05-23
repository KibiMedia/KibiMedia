/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Coments;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishas
 */
public interface ComentsDao {
    
    public void addComents(Coments coments) throws SQLException;
    public void deleteComents(Coments coments) throws SQLException;
    public void deleteComents(int id) throws SQLException;
    public Coments getComents(int id) throws SQLException;
    public ArrayList<Coments> getAllComents() throws SQLException;
}
