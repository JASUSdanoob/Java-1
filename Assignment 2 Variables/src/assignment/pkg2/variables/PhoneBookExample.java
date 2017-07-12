/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.variables;

/**
 *
 * @author Education Unlimited
 */
public class PhoneBookExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assignment2Variables p1 = new Assignment2Variables("Random", "p-Money", "(510) 408-9374");
        PhoneBook pb = new PhoneBook();
        pb.addPerson(p1);
        Assignment2Variables p2 = new Assignment2Variables("Jesus", "Resendiz", "(650) 384-5882");
        pb.addPerson(p2); 
        Assignment2Variables p3 = new Assignment2Variables("Kendirick", "Lamar", "(210) 745-6845");
        pb.addPerson(p3);
        Assignment2Variables p4 = new Assignment2Variables("Donald", "Glover", "(354) 846-9822");
        pb.addPerson(p4);
        pb.printEntries();

    }
    
}
