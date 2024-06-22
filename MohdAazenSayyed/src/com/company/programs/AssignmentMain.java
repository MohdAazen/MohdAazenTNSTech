package com.company.programs;

import java.util.Scanner;

import com.MohdAazen.assignment1.employees.Developer;
import com.MohdAazen.assignment1.employees.Manager;
import com.MohdAazen.assignment1.utilities.EmployeeUtilities;


public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Mohd Aazen", 101, 90000);
        manager.setTeam_size(10);
     
        Developer developer = new  Developer("Kalim Ali", 102, 80000);
        developer.setProgLang("Java");
        
        System.out.println("Manager Details:");
        EmployeeUtilities eU = new EmployeeUtilities();
        eU.getPrintedInfoMan(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.getPrintedInfoDev(developer);
    }
}
/*
Main Class: 
• Create a main class named AssignmentMain outside of any package. 
• In the AssignmentMain class, create instances of Manager and Developer. 
• Use the EmployeeUtilities methods to perform operations on the employee objects. 
*/