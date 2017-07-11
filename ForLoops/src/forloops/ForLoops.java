/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloops;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("I love Java");
        }
        System.out.println();
        System.out.println("Please enter a number.");
        int num = Integer.parseInt(keyboard.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        int starting;
        int ending;
        int counting;
        System.out.println("Please enter a starting number.");
        starting = Integer.parseInt(keyboard.nextLine());
        System.out.println("Please enter an ending number.");
        ending = Integer.parseInt(keyboard.nextLine());
        System.out.println("Please enter a number to count by.");
        counting = Integer.parseInt(keyboard.nextLine());
        for (int e = starting; e <= ending; e += counting) {
            System.out.println();
            System.out.println(e + " ");
        }
        
        
        System.out.println();
        int [] array1 = new int [10];
        array1[0] =1;
        array1[1] =2;
        array1[2] =3;
        array1[3] =4;
        array1[4] =5;
        array1[5] =6;
        array1[6] =7;
        array1[7] =8;
        array1[8] =9;
        array1[9] =10;
        
        System.out.println("The element at index 0 is " + array1[0] + ".");
        System.out.println("The element at index 1 is " + array1[1] + ".");
        System.out.println("The element at index 2 is " + array1[2] + ".");
        System.out.println("The element at index 3 is " + array1[3] + ".");
        System.out.println("The element at index 4 is " + array1[4] + ".");
        System.out.println("The element at index 5 is " + array1[5] + ".");
        System.out.println("The element at index 6 is " + array1[6] + ".");
        System.out.println("The element at index 7 is " + array1[7] + ".");
        System.out.println("The element at index 8 is " + array1[8] + ".");
        System.out.println("The element at index 9 is " + array1[9] + ".");
        
        System.out.println();
        
        
    }

}
