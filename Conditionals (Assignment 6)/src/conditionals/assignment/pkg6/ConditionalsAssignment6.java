/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals.assignment.pkg6;
import java.util.Scanner;

public class ConditionalsAssignment6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
                
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 6 question.");
        
         System.out.println("Question 2: Was George W. Bush the first president of the United States of America?");
         System.out.println("\tA) True");
         System.out.println("\tB) False");
         String answer2 = keyboard.nextLine();
         if (answer2.equals("B")) {
             System.out.println("That is correct!");
             rightAnswers++;
         } 
         else {
             System.out.println("Wrong!! It is FLASE!!");
         }
         
         System.out.println("Your score is " + rightAnswers + " out of 6 question.");
         
         System.out.println("Question 3: what is 2 + 2 equal to?");
         System.out.println("\tA) 1");
        System.out.println("\tB) 3");
        System.out.println("\tC) 4");
        System.out.println("\tD) 5");
       String answer3 = keyboard.nextLine();
       if (answer3.equals("C")) {
             System.out.println("That is correct!");
             rightAnswers++;
         } 
       else {
             System.out.println("Wrong!! It is C!!");
         }
       System.out.println("Your score is " + rightAnswers + " out of 6 question.");
       
       
       System.out.println("Question 4: What do humans breathe in?");
         System.out.println("\tA) Oxygen");
        System.out.println("\tB) Hydrogen");
        System.out.println("\tC) Nitrogen");
        System.out.println("\tD) Carbon");
       String answer4 = keyboard.nextLine();
       if (answer4.equals("A")) {
             System.out.println("That is correct!");
             rightAnswers++;
         } 
       else {
             System.out.println("Wrong!! It is A!!");
         }
       System.out.println("Your score is " + rightAnswers + " out of 6 question.");
       
       
       
       System.out.println("Question 5: What is the name of the sword that Link uses to defeat Ganon?");
         System.out.println("\tA) The Hero's Sword");
        System.out.println("\tB) The Guardian Sword");
        System.out.println("\tC) The Sword of Good");
        System.out.println("\tD) The Master Sword");
       String answer5 = keyboard.nextLine();
       if (answer5.equals("D")) {
             System.out.println("That is correct!");
             rightAnswers++;
         } 
       else {
             System.out.println("Wrong!! It is D!!");
         }
       System.out.println("Your score is " + rightAnswers + " out of 6 question.");
       
       
       
       System.out.println("Question 6: Who is Luke Skywalker's father?");
         System.out.println("\tA) Obi wan");
        System.out.println("\tB) Darth Vader");
        System.out.println("\tC) Han Solo");
        System.out.println("\tD) The Emperor");
       String answer6 = keyboard.nextLine();
       if (answer6.equals("B")) {
           
             System.out.println("That is correct!");
             rightAnswers++;
         } 
       else {
             System.out.println("Wrong!! It is B!!");
         }
       System.out.println("Your score is " + rightAnswers + " out of 6 question.");
       
       
    }
    
}