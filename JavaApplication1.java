/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input 15 numbers");

        int[] numb = new int[15];
        int i;

        for (i = 0; i < 15; i++) {
            System.out.println("Number" + (i + 1) + ":");
            numb[i] = input.nextInt();

        }
        System.out.println("What number should I search?");
        int find = input.nextInt();

        boolean found = false;

        for (i = 0; i < 15; i++) {
            if (find == numb[i]) {
                found = true;

                if (found) {
                    System.out.println(+find + " Was found in in index" + i);
                } else {
                    System.out.println(+find + " Was not found");
                }

            }
        }

        
}
}