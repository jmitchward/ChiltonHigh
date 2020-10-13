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
import java.util.Scanner;

/**
 *
 * @author Mitch
 */
public class StudentQuizGrades {
    
    static ArrayList updateScores(String studentName) {
        Scanner SC = new Scanner(System.in);
        ArrayList<Integer> quizzes = new ArrayList<>();
        int quizNum;
        System.out.println("Please enter the quiz scores for " + studentName);
        System.out.println("How many quizzes?");
        quizNum = Integer.parseInt(SC.nextLine());
        for (int i = 0; i < quizNum; i++) {
            System.out.println("Quiz " + (i+1));
            quizzes.add(Integer.parseInt(SC.nextLine()));
        }
        return quizzes;
    }

    public static void main(String [] args) {
        Map<String, ArrayList<Integer>> historyGrades = new HashMap<>();
        ArrayList<Integer> quizScores = new ArrayList<Integer>();
        ArrayList<String> classNames = new ArrayList<String>();
        StudentRoster ChiltonHigh = new StudentRoster();
        
        ChiltonHigh.addStudent("Abbey", 4.0, 12);
        ChiltonHigh.addStudent("Mitchell", 3.9, 12);
        ChiltonHigh.addStudent("Jaxon", 4.0, 12);
        ChiltonHigh.addStudent("Jude", 4.0, 12);
        
        System.out.println("Current Students: ");
        ChiltonHigh.listStudents();
        
        classNames = ChiltonHigh.getNames();
        for (String each : classNames) {
            quizScores = updateScores(each);
            historyGrades.put(each, quizScores);
            ChiltonHigh.updateScores("History", each, quizScores);
        }
        
        System.out.println("History Scores");
        ChiltonHigh.listScores("History");
        
        System.out.println("Average Score:");
        ChiltonHigh.averageScores("History");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
