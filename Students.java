/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kdost
 */
public class Student {
    
    private String name;
    private String studentNumber;
    
    public Student (String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getStudentNumber() {
        return this.studentNumber;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.studentNumber + ")";
    }
    
}


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program

        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        String userInputName = "";
        String userInputNumber = "";
        String userInputSearch = "";
        
        while (true) {
            System.out.print("name: ");
            userInputName = reader.nextLine();
            if (userInputName.equals("")) {
                break;
            }
            System.out.print("student number: ");
            userInputNumber = reader.nextLine();
            list.add(new Student(userInputName, userInputNumber));
        }
        for (Student stu : list) {
            System.out.println(stu.getName() + " (" + stu.getStudentNumber() + ")");
        }
        
        System.out.println("Give search term:");
        userInputSearch = reader.nextLine();
        
        for (Student stu : list) {
            if (stu.getName().contains(userInputSearch)) {
                System.out.println("Result: ");
                System.out.println(stu.toString());
            }
        }
        
        
    }
}
