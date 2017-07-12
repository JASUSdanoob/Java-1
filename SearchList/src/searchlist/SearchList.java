/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class SearchList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList a = new ArrayList();
        a.add(5);
        a.add(45);
        a.add(10);
        a.add(18);
        a.add(2);
        a.add(20);
        a.add(30);
        a.add(42);
        a.add(22);
        a.add(12);
        a.add(4);
        System.out.println("Please enter a number so we can search for it.");
        int search = Integer.parseInt(keyboard.nextLine());
        boolean found = false;
        int counter = 0;
        for (int i = 0; i < a.size(); i++) {
            if (search == (int) a.get(i)) {
                found = true;
            }

        }
        System.out.println(found);
        System.out.println("Now we will find the maximum. The max is ...");
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            if (max < (int) a.get(i)) {
                max = (int) a.get(i);
            }
        }
        System.out.println(max);

        ArrayList<String> b = new ArrayList();
        b.add("A "); //0
        b.add("bunch ");//3
        b.add("of ");
        b.add("revolutionary ");
        b.add("manumission ");
        b.add("abolitionists, "); //1
        b.add("give ");
        b.add("me ");
        b.add("your ");
        b.add("position ");
        b.add("show ");
        b.add("me ");
        b.add("where ");
        b.add("the ");
        b.add("ammunition "); //2
        b.add("is!");
        
        ArrayList c = new ArrayList();
        
        while (b.size() != 0) {
            String first = b.get(0);
            for(int i =0; i<b.size ();i++ ){
                if (first.compareTo(b.get(i)) >0){
                    first = b.get(i);
                }
            }
            
            b.remove(first);
            c.add(first);
        }
        
        System.out.print(c);
    }

}
