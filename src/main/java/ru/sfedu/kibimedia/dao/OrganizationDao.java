/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import ru.sfedu.kibimedia.tables.Organization;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mishas
 */
public interface OrganizationDao {
    
    public void addOrganization(Organization organization) throws SQLException;
    public void deleteOrganization(Organization organization) throws SQLException;
    public void deleteOrganization(int id) throws SQLException;
    public Organization getOrganization(int id) throws SQLException;
    public ArrayList<Organization> getOrganizations() throws SQLException;
}
