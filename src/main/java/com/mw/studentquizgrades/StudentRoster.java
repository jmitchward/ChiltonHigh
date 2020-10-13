/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mw.studentquizgrades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mitch
 */
public class StudentRoster {
    Scanner SC = new Scanner(System.in);
    ArrayList<Student> classRoster = new ArrayList<>();
    
    StudentRoster() {
        System.out.println("Roster created.");
    }
    
    void addStudent() {
        String name;
        double gpa;
        int grade;
        System.out.println("Name: ");
        name = SC.nextLine();
        System.out.println("GPA: ");
        gpa = Double.parseDouble(SC.nextLine());
        System.out.println("Grade Level: ");
        grade = Integer.parseInt(SC.nextLine());
        
        addStudent(name, gpa, grade);
    }
    void addStudent(String name, double gpa, int grade){
        classRoster.add(new Student(name, gpa, grade));
    }
    
    void removeStudent(String name) {
        for (Student s : classRoster) {
            if (s.getName() == name) {
                classRoster.remove(s);
            }
        }
    }
    
    void listStudents() {
        for (Student s : classRoster) {
            System.out.println(s.getName());
        }
    }
    
    ArrayList getNames() {
        ArrayList<String> classNames = new ArrayList<String>();
        for (Student s : classRoster) {
            classNames.add(s.getName());
        }
        return classNames;
    }
    
    Student getStudent(String name) {
        for (Student s : classRoster) {
            if (s.getName() == name) {
                return s;
            }
            else {
                System.out.println("Student cannot be found.");
                return null;
            }
        }
        return null;
    }
    
    void updateScores(String className, String studentName, ArrayList newScore) {
        for (Student s : classRoster) {
            if (s.getName() == studentName) {
                s.addScore(className, newScore);
            }
        }
    }
    
    void listScores(String className) {
        for (Student s : classRoster) {
            System.out.println(s.getName());
            System.out.println(s.getScores(className));
        }
    }
    
    void averageScores(String className) {
        ArrayList<Integer> allScores = new ArrayList<>();
        for (Student s : classRoster) {
            int total = 0;
            System.out.println(s.getName());
            allScores = s.getScores(className);
            for (int scores : allScores) {
                total += scores;
            }
            System.out.println(total / allScores.size());
        }
    }
    
}
