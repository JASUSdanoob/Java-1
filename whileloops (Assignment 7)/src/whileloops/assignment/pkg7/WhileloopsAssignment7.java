/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloops.assignment.pkg7;
import java.util.Scanner;

public class WhileloopsAssignment7 {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "How many time would you like something repeated " );
       int number = Integer.parseInt(keyboard.nextLine());
       System.out.print( "Now type what you want to get repeated " );
       String input = keyboard.nextLine();
       
       System.out.println("Here we go!");
       int count = 0;
       while (count < number) {
           System.out.println(input);
           count ++;
       }
    }
    
}