/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoInterface;

import java.util.List;
import model.Employee;

/**
 *
 * @author jeanl
 */
public interface DaoEmployee {
    void create(Employee employee);
    
    List<Employee> findAll();
}
