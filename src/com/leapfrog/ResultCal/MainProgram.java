/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ResultCal;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainProgram {

    public static void main(String[] args) {

        Scanner marks = new Scanner(System.in);

        while (true) {
            float[] markAll = new float[5];
            int i = 0;
            float total = 0;
            boolean isPass = true;
            boolean yes = true;
            float min = 100;
            float max = 0;
            while (i < 5) {
                markAll[i] = 0;
                if (i == 0) {
                    System.out.println("Enter the mark of English");
                } else if (i == 1) {
                    System.out.println("Enter the mark of Maths");
                } else if (i == 2) {
                    System.out.println("Enter the mark of Nepali");
                } else if (i == 3) {
                    System.out.println("Enter the mark of Science");
                } else if (i == 4) {
                    System.out.println("Enter the mark of Computer");
                }

                markAll[i] = marks.nextFloat();
                if (markAll[i] < 40) {
                    isPass = false;
                }
                total = total + markAll[i];
                if (markAll[i] < min) {
                    min = markAll[i];
                }
                if (markAll[i] > max) {
                    max = markAll[i];
                }
                i++;

            }
            if (isPass == false) {
                System.out.println("Status:Fail");
            } else {
                System.out.println("Status:Pass");
            }
            System.out.println("Grand total=" + total);
            float per = (total / 500) * 100;
            System.out.println("Percentage=" + per + "%");
            if (per >= 80) {
                System.out.println("Grade=A");
            } else if (per >= 70) {
                System.out.println("Grade=B");
            } else if (per >= 60) {
                System.out.println("Grade=C");
            } else if (per >= 50) {
                System.out.println("Grade=D");
            } else if (per >= 40) {
                System.out.println("Grade=E");
            } else {
                System.out.println("Grade=E");
            }
            System.out.println("Minimum=" + min);
            System.out.println("Maximum=" + max);

            System.out.println("Do you want do power[Y/N]");
            String pow = marks.next();
            if (pow.equalsIgnoreCase("y")) {
                while (yes == true) {
                    System.out.println("Enter the base number");
                    int base = marks.nextInt();
                    System.out.println("Enter power for the base number");
                    int power = marks.nextInt();
                    int result = 1;
                    for (i = 0; i < power; i++) {

                        result = result * base;
                        
                    }
                    System.out.println("Power of " + base+"^"+power + "=" + result);

                    System.out.println("Do you wanna again do the power[Y/N]");
                    String conn = marks.next();
                    if (conn.equalsIgnoreCase("n")) {
                        yes = false;
                    }
                }
            }
            System.out.println("Do you wanna continue[Y/N]");
            String con = marks.next();
            if (con.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
}
