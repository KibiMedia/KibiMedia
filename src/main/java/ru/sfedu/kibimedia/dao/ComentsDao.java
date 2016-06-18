/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Comment;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mishas
 */
public interface CommentDao {
    
    public void addComent(Comment coment) throws SQLException;
    public void deleteComent(Comment coment) throws SQLException;
    public void deleteComentById(int id) throws SQLException;
    public Comment getComent(int id) throws SQLException;
    public ArrayList<Comment> getComment() throws SQLException;
}
