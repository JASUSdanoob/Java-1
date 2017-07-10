/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner.assignment.pkg5;
import java.util.Scanner;
public class ScannerAssignment5 {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
       String name = keyboard.nextLine();
       System.out.println("Hey " + name + " , how old are you?");
       int age = Integer.parseInt(keyboard.nextLine());
       int dob = 2017 - age;
       System.out.println("The year you were born was " + dob);
       System.out.println("Is this the correct year? If this is not please correct it.");
       int cdob = Integer.parseInt(keyboard.nextLine());
       System.out.println("So " + name + " , when is your birth month?");
       String month = keyboard.nextLine();
       System.out.println("What day is your birthday?");
       int day = Integer.parseInt(keyboard.nextLine());
       System.out.println("What is your favorite book?");
       String book = keyboard.nextLine();
       System.out.println("What is your hometown?");
       String hometown = keyboard.nextLine();
       System.out.println("What is your favorite number?");
       double favnumber = Double.parseDouble(keyboard.nextLine());
       System.out.println("What is your shoe size?");
       double shoesize = Double.parseDouble(keyboard.nextLine());
       System.out.println("On a scale from 1 to 5, how excited are you tp learn Java?");
       double scale = Double.parseDouble(keyboard.nextLine());
       System.out.println("What is one cool fact about yourself?");
       String fact = keyboard.nextLine();
       System.out.println(name + "," + age + "," + month + day + "," + cdob + "." + name + " is from " + hometown + "." + name + " has the lucky number " + favnumber + " and a shoe size of " + shoesize + "." + "On a scale of 1 to 5, " + name + " Is this excited to learn about Java: " + scale + "." + "A fun fact about " + name + "is" + fact + ".");
    }
    
}
