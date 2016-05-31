/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.kibimedia.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import ru.sfedu.kibimedia.tables.Employee;
/**
 *
 * @author 1
 */
public interface EmployeeDao {
    
    public void addEmployee(Employee employee) throws SQLException;
    public void deleteEmployee(Employee employee) throws SQLException;
    public void deleteEmployeeById(int id) throws SQLException;
    public Employee getEmployee(int id) throws SQLException;
    public ArrayList<Employee> getEmployee() throws SQLException;
}
