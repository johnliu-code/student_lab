/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import java.util.List;
import model.Student;
import java.util.ArrayList;
import DaoInterface.DaoStudent;
import java.util.Scanner;

/**
 *
 * @author tlazr
 */
public class StudentDaoImp implements DaoStudent {

    private final List<Student> listStudents;

    public StudentDaoImp() {

        listStudents = new ArrayList<>();

    }

    @Override
    public void create(Student student) {
        listStudents.add(student);
    }

    @Override
    public List<Student> findAll() {

        return listStudents;
    }

    @Override
    public void add(Student student, List<Student> listStudents) {
        Scanner sc = new Scanner(System.in);
        //Add student by user
        System.out.println("How many Students you want to add? : ");
        int rep = sc.nextInt();
        int studentNumber = 0;

        while (studentNumber < rep) {
            System.out.println("First Name: ");
            String firstname = sc.next();
            System.out.println("Last Name: ");
            String lastname = sc.next();
            System.out.println("Id: ");
            int id = sc.nextInt();

            student = new Student(firstname, lastname, id);
            listStudents.add(student);

            studentNumber++;
        }
    }

    @Override
    public void delete(Student student, List<Student> listStudent) {
        List<Student> studentToRemove = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Delete Student by ID, entre Student Id PLS");
        int byid = sc.nextInt();
        listStudents.forEach((Student s) -> {
            int id = s.getId();
            if (id == byid) {
                studentToRemove.add(s);
            }
        });
        listStudents.removeAll(studentToRemove);
    }

    @Override
    public void update(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Update student by ID, entre Student Id PLS");
        int updateid = sc.nextInt();
        System.out.println(" ID : " + "         " + " First Name : " + "         " + "Last Name: ");
        listStudents.forEach((s) -> {
            int id = s.getId();
            if (id == updateid) {
                System.out.println("New Id number: ");
                int newid = sc.nextInt();
                System.out.println("New Firs Name: ");
                String newFistName = sc.next();
                System.out.println("New Last Name: ");
                String newLastName = sc.next();
                s.setId(id);
                s.setFirstName(newFistName);
                s.setLastName(newLastName);
            }
        });
    }

    @Override
    public void find(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Search Student by 1: ID, 2: First Name; 3: Last Name");
        int searchBy = sc.nextInt();

        switch (searchBy) {
            case 1:
                System.out.println("Search Student Id: ");
                int studentId = sc.nextInt();
                listStudents.forEach((s) -> {
                    if (s.getId() == studentId) {
                        System.out.println("Student Id : " + s.getId() + "     " 
                                + "Student First Name : " + s.getFirstName() + "    " 
                                + "Student Last Name : " + s.getLastName());
                    }
                });

                break;
            case 2:
                System.out.println("Search Student First Name: ");
                String firstname = sc.next().toLowerCase();
                listStudents.forEach((s) -> {
                    String name = s.getFirstName().toLowerCase();
                    if (name.equals(firstname)) {
                        System.out.println("Student Id : " + s.getId() + "     " 
                                + "Student First Name : " + s.getFirstName() + "    " 
                                + "Student Last Name : " + s.getLastName());
                    }
                });

                break;
            case 3:
                System.out.println("Search Student Last Name: ");
                String lastname = sc.next().toLowerCase();
                listStudents.forEach((s) -> {
                    String name = s.getLastName().toLowerCase();
                    if (name.equals(lastname)) {
                        System.out.println("Student Id : " + s.getId() + "     " 
                                + "Student First Name : " + s.getFirstName() + "    " 
                                + "Student Last Name : " + s.getLastName());
                    }
                });

                break;
            default:
                System.out.println("Please entre number 1 , 2 , 3");
        }
    }

    @Override
    public void print(Student student) {
        System.out.println("Students list");
        System.out.println(" First Name : " + "         " + " Last Name : " + "         " + "Id : ");
        listStudents.forEach((s) -> {
            System.out.println(s.getFirstName() + "               "
                    + s.getLastName() + "               "
                    + s.getId());
        });
        System.out.println("------------------------------------------");
    }
}
