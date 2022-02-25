/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import DaoInterface.DaoEmployee;
import java.util.ArrayList;
import java.util.List;
import model.Employee;

/**
 *
 * @author jeanl
 */
public class EmployeeDaoImp implements DaoEmployee{
    private final List<Employee> listEmployees;
    
    public EmployeeDaoImp(){
        listEmployees = new ArrayList<>();
    }

    @Override
    public void create(Employee employee) {
        listEmployees.add(employee);
    }

    @Override
    public List<Employee> findAll() {
        return listEmployees;
    }
    
    
}
