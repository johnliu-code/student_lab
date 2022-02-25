/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import DaoInterface.DaoCours;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Cours;

/**
 *
 * @author jeanl
 */
public class CoursDaoImp implements DaoCours {

    private final List<Cours> listCours;
    int index;

    public CoursDaoImp() {
        listCours = new ArrayList<>();
    }

    @Override
    public void create(Cours cours) {
        listCours.add(cours);
    }

    @Override
    public List<Cours> findAll() {
        return listCours;
    }

    @Override
    public void delete(Cours cours, List<Cours> listCours) {
        List<Cours> coursToRemove = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Delete cours by ID, entre Cours Id PLS");
        int byid = sc.nextInt();
        listCours.forEach((Cours s) -> {
            int id = s.getCoursId();
            if (id == byid) {
                coursToRemove.add(s);
            }
        });
        listCours.removeAll(coursToRemove);
    }

    @Override
    public void update(Cours cours) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Update cours by ID, entre Cours Id PLS");
        int updateid = sc.nextInt();
        System.out.println(" ID : " + "         " + " Cours Name : ");
        listCours.forEach((s) -> {
            int id = s.getCoursId();
            if (id == updateid) {
                System.out.println("New Id number: ");
                int newid = sc.nextInt();
                System.out.println("New Name: ");
                String newname = sc.next();
                s.setCoursId(newid);
                s.setCoursName(newname);
            }
        });
    }

    @Override
    public void print(Cours cours) {
        System.out.println("Cours list");
        System.out.println(" ID : " + "         " + " Cours Name : ");
//        for (int i = 0; i < listCours.size(); i++) {
//            System.out.println(listCours.get(i).getCoursId() + "    "
//                    + listCours.get(i).getCoursName());
//        }
        listCours.forEach((s) -> {
            System.out.println(s.getCoursId() + "              "
                    + s.getCoursName());
        });
        System.out.println("-------------------------------------------");
    }

    @Override
    public void find(Cours cours) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Search Cours by 1: ID, 2: Name");
        int searchBy = sc.nextInt();

        switch (searchBy) {
            case 1:
                System.out.println("Search Cours Id: ");
                int coursid = sc.nextInt();
                listCours.forEach((s) -> {
                    if (s.getCoursId() == coursid) {
                        System.out.println("Cours Id : " + coursid + "     " + "Cours Name : " + s.getCoursName());
                    }
                });

                break;
            case 2:
                System.out.println("Search Cours Name: ");
                String coursname = sc.next().toLowerCase();
                listCours.forEach((s) -> {
                    String name = s.getCoursName().toLowerCase();
                    if (name.equals(coursname)) {
                        System.out.println("Cours Id : " + s.getCoursId() + "     " + "Cours Name : " + s.getCoursName());
                    }
                });

                break;
            default:
                System.out.println("Please entre number 1 or 2");
        }
    }

    @Override
    public void add(Cours cours, List<Cours> listCours) {
        Scanner sc = new Scanner(System.in);
        //Add cours by user
        System.out.println("Veuillez entrer combien des Cours? : ");
        int rep = sc.nextInt();
        int coursNumber = 0;

        while (coursNumber < rep) {
            System.out.println("Cours ID: ");
            int coursid = sc.nextInt();
            System.out.println("Cours Name: ");
            String coursname = sc.next();

            cours = new Cours(coursid, coursname);
            listCours.add(cours);

            coursNumber++;
        }
    }

}
