/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import DaoInterface.DaoEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Employee;

/**
 *
 * @author jeanl
 */
public class EmployeeDaoImp implements DaoEmployee {

    private final List<Employee> listEmployees;

    public EmployeeDaoImp() {
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

    @Override
    public void add(Employee employee, List<Employee> listEmployee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Employee employee, List<Employee> listEmployee) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Delete Employee by ID, entre Employee Id PLS");
        int byid = sc.nextInt();
                for(Employee e: listEmployee){
                        int id = e.getId();
            if (id == byid) {
                listEmployee.remove(e);
                break;
            }
        }

//        List<Employee> employeeToRemove = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Delete Employee by ID, entre Employee Id PLS");
//        int byid = sc.nextInt();
//        listEmployees.forEach((Employee s) -> {
//            int id = s.getId();
//            if (id == byid) {
//                employeeToRemove.add(s);
//            }
//        });
//        listEmployees.removeAll(employeeToRemove);
    }

    @Override
    public void update(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void find(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
