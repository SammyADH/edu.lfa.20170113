package edu.lfa.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Enroll {

    private Scanner input = new Scanner(System.in);
    private Enroll_Const check = new Enroll_Const();
    private static Main_view var = new Main_view();

    public void Emain() {
        while (true) {
            System.out.println("About Enrollment:");
            System.out.println("1.Show Status");
            System.out.println("2. Exit");

            System.out.println("Enter your choice [1-2]");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student Id : ");
                    int stdId = input.nextInt();
                    check.setStdId(stdId);
                    System.out.println("Enter Course Id : ");
                    int crsId = input.nextInt();
                    check.setCrsId(crsId);
                    if (check.Check_Status() == true) {
                        System.out.println("The student is enrolled in given course");
                    } else {
                        System.out.println("Enrollment record not found");
                    }
                    break;

                case 2:
                    System.exit(0);

                default:
                    var.controller();
                    break;
            }

        }

    }

}
