/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highorlow.assignment.pkg9;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class HighOrLowAssignment9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 1;
        int secret = (int) (Math.random() * 100) + 1;;
        System.out.println("Can you guess the secret number?");
        int guess = Integer.parseInt(keyboard.nextLine());
        while (guess != secret) {
                
            if (guess < secret) {
                System.out.println("Your guess was to low");
                System.out.println("try again");
                guess = Integer.parseInt(keyboard.nextLine());
                count++;
            } else {
                System.out.println("Your guess was to high");
                System.out.println("try again");
                guess = Integer.parseInt(keyboard.nextLine());
                count++;
            }

        }

        if (guess == secret) {
            System.out.println("Congrats you guessed the correct number");
        }
        System.out.println("You guessed " + count + " times.");
                
    }

}
