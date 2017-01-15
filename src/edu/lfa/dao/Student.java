/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Student {

    private static List<SArraylist> slist = new ArrayList<>();
    private static Main_view var = new Main_view();
    private Scanner input = new Scanner(System.in);

    public void Smain() {

        while (true) {
            System.out.println("About Student:");
            System.out.println("1.Add ");
            System.out.println("2.Show all");
            System.out.println("3.Delete");

            System.out.println("Enter your choice [1-3]");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    SArraylist sa = new SArraylist();
                    System.out.println("Enter Student id");
                    sa.setId(input.nextInt());
                    System.out.println("Enter Student Fname");
                    sa.setFname(input.next());
                    System.out.println("Enter Student Lname");
                    sa.setLname(input.next());
                    System.out.println("Enter Student email");
                    sa.setEmail(input.next());
                    slist.add(sa);
                    break;
                case 2:

                    for (SArraylist sal : slist) {
                        System.out.println(sal.toString());
                    }
                    break;
                case 3:

                    System.out.println("Enter student id");
                    int sid = input.nextInt();
                    for (SArraylist sal : slist) {
                        if (sid == sal.getId()) {
                            slist.remove(sal);
                            System.out.println("Sucessfilly Deleted");
                        } else {
                            System.out.println("Data not deleted");
                        }
                    }
                    break;

                default:
                    var.controller();
                    break;
            }

        }

    }
}
