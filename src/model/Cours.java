/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jeanl
 */
public class Cours {
    private int CoursId;
    private String CoursName;

    public Cours(int CoursId, String CoursName) {
        this.CoursId = CoursId;
        this.CoursName = CoursName;
    }

    public Cours() {
        
    }

    public int getCoursId() {
        return CoursId;
    }

    public void setCoursId(int CoursId) {
        this.CoursId = CoursId;
    }

    public String getCoursName() {
        return CoursName;
    }

    public void setCoursName(String CoursName) {
        this.CoursName = CoursName;
    }
    
    
    
}
