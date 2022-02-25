/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectInterface;

import DaoImp.CoursDaoImp;
import DaoImp.EmployeeDaoImp;
import DaoImp.StudentDaoImp;
import DaoInterface.DaoCours;
import DaoInterface.DaoEmployee;
import DaoInterface.DaoStudent;
import model.Student;
import model.Cours;
import model.Employee;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jeanl
 */
public class JavaApplicationIterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Menu to switch
        System.out.println("C: Cours; E: Employees; S: Students");
        String opt = sc.next().toUpperCase();
        switch (opt) {
            case "C":
                //Cours
                DaoCours daoCours = new CoursDaoImp();
                Cours cours = new Cours();

                Cours cours1 = new Cours(101, "English");
                daoCours.create(cours1);

                Cours cours2 = new Cours(102, "French");
                daoCours.create(cours2);
                daoCours.print(cours);

                //Menu for cours
                String backMenu = "Y";
                while ("Y".equals(backMenu)) {
                    List<Cours> listCours = daoCours.findAll();
                    System.out.println("A: Add Cours; D: Delete Cours; F: Find Cours; U: Update Cours; P: Print Cours; Q: Quit");
                    String menuOption = sc.next().toUpperCase();
                    switch (menuOption) {
                        case "A":
                            daoCours.add(cours, listCours);
                            break;
                        case "D":
                            daoCours.delete(cours, listCours);
                            break;
                        case "F":
                            daoCours.find(cours);
                            break;
                        case "U":
                            daoCours.update(cours);
                            break;
                        case "P":
                            daoCours.print(cours);
                            break;
                        case "Q":
                            break;

                        default:
                            System.out.println("Please entre indicated value: A/D/F/P/U/Q");
                    }
                    if (!"Q".equals(menuOption)) {
                        System.out.println("Back to menu: Y/N?");
                        backMenu = sc.next().toUpperCase();
                    } else {
                        break;
                    }
                }
                break;
            case "E":
                // Employee
                DaoEmployee employeeDao = new EmployeeDaoImp();
                Employee employee = new Employee();

                Employee employee1 = new Employee(001, "Toufik", "Lazri");
                employeeDao.create(employee1);

                Employee employee2 = new Employee(002, "David", "Racicot");
                employeeDao.create(employee2);

                List<Employee> listEmp = employeeDao.findAll();
                employeeDao.delete(employee, listEmp);

                System.out.println("Employee list");
                System.out.println(" ID : " + "         " + " First Name : " + "         " + "Last Name : ");
                listEmp.forEach((s) -> {
                    System.out.println(s.getId() + "              "
                            + s.getFirstName() + "               "
                            + s.getLastName());
                });
                System.out.println("---------------------------------------------");
                break;

            case "S":
                // Student       
                DaoStudent daoStudent = new StudentDaoImp();
                Student student = new Student();

                Student student1 = new Student("Karim", "Benzema", 1);
                daoStudent.create(student1);

                Student student2 = new Student("Christiano", "Ronaldo", 2);
                daoStudent.create(student2);

                List<Student> list = daoStudent.findAll();
                daoStudent.print(student);

                //Menu for Students
                String backToMenu = "Y";
                while ("Y".equals(backToMenu)) {
                    List<Student> listStu = daoStudent.findAll();
                    System.out.println("A: Add Student; D: Delete Student; F: Find Student; U: Update Student; P: Print Student; Q: Quit");
                    String menuOption = sc.next().toUpperCase();
                    switch (menuOption) {
                        case "A":
                            daoStudent.add(student, list);
                            break;
                        case "D":
                            daoStudent.delete(student, listStu);
                            break;
                        case "F":
                            daoStudent.find(student);
                            break;
                        case "U":
                            daoStudent.update(student);
                            break;
                        case "P":
                            daoStudent.print(student);
                            break;
                        case "Q":
                            break;

                        default:
                            System.out.println("Please entre indicated value: A/D/F/P/U/Q");
                    }
                    if (!"Q".equals(menuOption)) {
                        System.out.println("Back to menu: Y/N?");
                        backToMenu = sc.next().toUpperCase();
                    } else {
                        break;
                    }
                }
                break;

            default:
                System.out.println("Please entre C or E or S: ");
        }

    }

}
