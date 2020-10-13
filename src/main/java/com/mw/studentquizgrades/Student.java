/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mw.studentquizgrades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mitch
 */
public class Student {
    private String name;
    private double gpa;
    private int gradeLevel;
    private Map<String, ArrayList<Integer>> grades = new HashMap<>();
    private ArrayList<Integer> classA = new ArrayList<>();
    
    
    Student() {
        System.out.println("Empty student created.");
    }
    
    Student(String newName, Double newGPA, int newGrade) {
        this.name = newName;
        this.gpa = newGPA;
        this.gradeLevel = newGrade;
        // System.out.println("Student added successfully.");
    }
    
    void setName(String newName) {
        this.name = newName;
    }
    
    String getName() {
        return name;
    }
    
    void setGPA(Double newGPA) {
        this.gpa = newGPA;
    }
    
    Double getGPA() {
        return gpa;
    }
    
    void setGrade(int newGrade) {
        this.gradeLevel = newGrade;
    }
    
    Integer getGrade() {
        return gradeLevel;
    }
    
    void addScore(String className, ArrayList scores) {
        grades.put(className, scores);
    }
    
    ArrayList<Integer> getScores(String className) {
        return grades.get(className);
    }
    
}
