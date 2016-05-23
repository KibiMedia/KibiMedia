/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Users;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishas
 */
public interface UsersDao {
    
    public void addUsers(Users users) throws SQLException;
    public void deleteUsers(Users users) throws SQLException;
    public void deleteUsers(int id) throws SQLException;
    public Users getUsers(int id) throws SQLException;
    public ArrayList<Users> getAllUsers() throws SQLException;
}
