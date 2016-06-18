/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Preview;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mishas
 */
public interface PreviewDao {
    
    public void addPreview(Preview preview) throws SQLException;
    public void updatePreview(Preview preview) throws SQLException;
    public void deletePreview(Preview preview) throws SQLException;
    public void deletePreview(int id) throws SQLException;
    public Preview getPreview(int id) throws SQLException;
    public ArrayList<Preview> getPreviews() throws SQLException;
    
}
