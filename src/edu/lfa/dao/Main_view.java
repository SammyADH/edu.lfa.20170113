
package edu.lfa.dao;

import java.util.Scanner;


class Main_view {
    public void controller(){
    Scanner input = new Scanner(System.in);
        Student s = new Student();
        Course c = new Course();
        Enroll e = new Enroll();
        System.out.println("Information About:");
        System.out.println("1.Student");
        System.out.println("2.Course");
        System.out.println("3.Enroll");

        System.out.println("Enter your choice [1-3]");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                s.Smain();
                break;
            case 2:
                c.Cmain();
                break;
            case 3:
                e.Emain();
                break;

            default:
                System.exit(0);
        }
}
    
}
