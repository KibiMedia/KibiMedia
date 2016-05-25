/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Organizations;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mishas
 */
public interface OrganizationsDao {
    
    public void addOrganization(Organizations organization) throws SQLException;
    public void deleteOrganization(Organizations organization) throws SQLException;
    public void deleteOrganization(int id) throws SQLException;
    public Organizations getOrganization(int id) throws SQLException;
    public ArrayList<Organizations> getOrganizations() throws SQLException;
}
