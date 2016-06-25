/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import ru.sfedu.kibimedia.tables.Award;
/**
 *
 * @author 1
 */
public interface AwardDao {
    public void addAward(Award award) throws SQLException;
    public void deleteAward(Award award) throws SQLException;
    public void deleteAward(int id) throws SQLException;
    public Award getAwardById(int id) throws SQLException;
    public ArrayList<Award> getAward() throws SQLException;
    
}
