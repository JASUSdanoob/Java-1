/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubles.assignment.pkg8;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class DoublesAssignment8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int dice1 = 0;
        int dice2 = 1;
        int roll = 0;
        System.out.println("Would you like to roll the dice? If 'yes' type 'yes'. If 'no' type 'no'.");
        String imput = keyboard.nextLine();
       while (dice1 != dice2 && imput.equals("yes")) {
                dice1 = (int) (Math.random() *6) +1;
                dice2 = (int) (Math.random() *6) + 1;
                System.out.println("You rolled " + dice1 + " and " + dice2 );
                roll++;
                 if (dice1 != dice2 ) {
                    System.out.println("Would you like to roll the dice? If 'yes' type 'yes'. If 'no' type 'no'.");
                    imput = keyboard.nextLine();
                 }
            } 
        if (dice1 == dice2 ) {
            System.out.println("You rolled " + dice1 + " and " + dice2 + " . It rolled " + roll + " times.");
        }
        else {
            System.out.println("Game Over");
        }
       
        
    }
    
}
