/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoInterface;

import java.util.List;
import model.Student;

/**
 *
 * @author jeanl
 */
public interface DaoStudent {
    void create(Student student);
    void add(Student student, List<Student> listStudent);
    void delete(Student student, List<Student> listStudent);
    void update(Student student);
    void find(Student student);
    void print(Student student);
    
    List<Student> findAll();

}
