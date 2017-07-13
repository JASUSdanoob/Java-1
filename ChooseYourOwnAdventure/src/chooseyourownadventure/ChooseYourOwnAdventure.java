/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourownadventure;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("CHOOSE YOUR OWN ADVENTURE!!!");
        System.out.println("\t THE GAME");
        System.out.println(" ");
        System.out.println("Type start to begin ");
        String choice = keyboard.nextLine();
        System.out.println(" ");
        if (choice.equals("start") || choice.equals("Start")) {
            System.out.println("Now we begin your adventure.");
            System.out.println("Your story begins in a far away kingdom, which has \nbeen brought to it's knees by a great evil. \nAll of the kingdom's defense has fallen, but now you\nthe chosen one has come to free the kingdom from evil.");
            System.out.println(" ");
            System.out.println("You start by entering the castle where the great evil resides.\nyou start off with a rusty shield and a rusty sword. ");
            System.out.println(" ");
            System.out.println("As you enter the first room a flying enemy thorws a fireball at you, lucky for you, you reacted\nquickly and blocked it with your shield.");
            System.out.println(" ");
            System.out.println("Now it is your turn what would you like to do?");
            System.out.println(" ");
            System.out.println("\tA) attack");
            System.out.println("\tB) run away");
            System.out.println("\tC) run to the next door");
            String choice1 = keyboard.nextLine();
            if (choice1.equals("A") || choice1.equals("a")) {
                System.out.println(" ");
                System.out.println("You defeated the enemy with a deadly blow, but your sword broke, lucky for you picked up his sword,\nwhich is known as a 'Knights Sword'. This sword has more durability than the rusty sword. ");
                System.out.println("You see that there are two doors. There is one to the left and one to the right.\n");
                String choice2 = keyboard.nextLine();
                if (choice2.equals("left") || choice2.equals("Left")) {
                    System.out.println("You went to the left door there you find a chest.\nWould you like to open the chest? \nBe care full there might be something bad in the chest.");
                    String choice3 = keyboard.nextLine();
                    if (choice3.equals("Yes") || choice3.equals("yes")) {
                        System.out.println(" ");
                        System.out.println("In the chest you found 'Knight's Armor'.Now you are face with two more doors.\nWhich door would you like to go to left or right.");
                    }
                    System.out.println(" ");
                    if (choice3.equals("No") || choice3.equals("no")) {
                        System.out.println("You quickly passed the offer to open the chest which had armor inside.Now you are face with two more doors.\nWhich door would you like to go to left or right.");

                    }
                    System.out.println(" ");
                    String choice4 = keyboard.nextLine();
                    System.out.println(" ");
                    if (choice4.equals("Right") || choice4.equals("right")) {
                        System.out.println("You have reach the great evil himself. He is planning to attack you what will you do?");
                        System.out.println("\tA) negotiate");
                        System.out.println("\tB) attack");
                        System.out.println("\tC) run away");
                    }
                    String choice5 = keyboard.nextLine();
                    if (choice5.equals("A") || choice5.equals("a")) {
                        System.out.println("Your negotiation skills were never good even in school you failed that class. This was a bad idea. He hit you and killed you.\nGAME OVER");
                        System.out.println(" ");
                    }
                    if (choice5.equals("B") || choice5.equals("b")) {
                        System.out.println("You attacked him just before he attacked you. You hit him with a mighty strike and you defeated him and saved the kingdom.\nYOU WIN!!!!!!");
                        System.out.println(" ");
                    }
                     if (choice5.equals("c") || choice5.equals("C")) {
                        System.out.println("You tried to run away, but he looked the door before you could run out of the room. Then he killed you.\nGAME OVER");
                        System.out.println(" ");
                    }
                    if (choice4.equals("left") || choice2.equals("Left")) {
                        System.out.println("You walk into the room and fall into a bottomless pit. There is no way to get out of the pit.\nGAME OVER");
                        System.out.println(" ");
                    }

                    

                }
                if (choice2.equals("Right") || choice2.equals("right")) {
                    System.out.print("You walk into a room full of gold coins you decide to steal them and not save the kingdom.\nHey at least your rich now and you can move your family to another kingdom.\nGAME OVER");
                    System.out.println(" ");
                }
            }
            if (choice1.equals("B") || choice1.equals("b")) {
                System.out.println(" ");
                System.out.println("You tried running away, but he threw another fireball at you and it hit you.\nYou burned and died.\nGAME OVER.");
            }
            if (choice1.equals("C") || choice1.equals("c")) {
                System.out.println(" ");
                System.out.println("You tried running toward the door, but there were two doors.\nThis confused you giving him the perfect time to strike\nThen you turn around and he strikes\nGAME OVER.");
            }

        } else {
            System.out.println("You need to follow directions better. Game Over");
        }

    }

}
