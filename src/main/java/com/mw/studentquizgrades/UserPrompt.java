/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mw.studentquizgrades;

import java.util.Scanner;

/**
 *
 * @author Mitch
 */
public class UserPrompt implements UserIO {
    Scanner SC = new Scanner(System.in);
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }
    
    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return SC.nextLine();
}
    
    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(SC.nextLine());
    }
    
    @Override
    public int readInt(String prompt, int min, int max) {
        int userInput;
        System.out.println(prompt);
        userInput = Integer.parseInt(SC.nextLine());
        if (userInput < min || userInput > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            userInput = readInt(prompt, min, max);
            return userInput;
        }
        return userInput;
    }
    
    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(SC.nextLine());
    }
    
    @Override
    public double readDouble(String prompt, double min, double max) {
        double userInput;
        System.out.println(prompt);
        userInput = Double.parseDouble(SC.nextLine());
        if (userInput < min || userInput > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            userInput = readDouble(prompt, min, max);
            return userInput;
        }
        return userInput;
    }
    
    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        return Float.parseFloat(SC.nextLine());
    }
    
    @Override
    public float readFloat(String prompt, float min, float max) {
        float userInput;
        System.out.println(prompt);
        userInput = Float.parseFloat(SC.nextLine());
        if (userInput < min || userInput > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            userInput = readFloat(prompt, min, max);
            return userInput;
        }
        return userInput;
    }
    
    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        return Long.parseLong(SC.nextLine());
    }
    
    @Override
    public long readLong(String prompt, long min, long max) {
        long userInput;
        System.out.println(prompt);
        userInput = Long.parseLong(SC.nextLine());
        if (userInput < min || userInput > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            userInput = readLong(prompt, min, max);
            return userInput;
        }
        return userInput;
    }
    
}
