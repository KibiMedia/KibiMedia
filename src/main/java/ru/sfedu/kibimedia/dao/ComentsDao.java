/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Coments;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mishas
 */
public interface ComentsDao {
    
    public void addComent(Coments coment) throws SQLException;
    public void deleteComent(Coments coment) throws SQLException;
    public void deleteComentById(int id) throws SQLException;
    public Coments getComent(int id) throws SQLException;
    public ArrayList<Coments> getComents() throws SQLException;
}
