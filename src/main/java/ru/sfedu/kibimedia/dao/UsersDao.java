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
    
    public void addUser(Users user) throws SQLException;
    public void deleteUser(Users user) throws SQLException;
    public void deleteUser(int id) throws SQLException;
    public Users getUserById(int id) throws SQLException;
    public ArrayList<Users> getUsers() throws SQLException;
    public Users getUserByLoginAndPassword(String login, String pass) throws SQLException;
}
