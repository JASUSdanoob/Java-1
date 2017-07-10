/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booleans.assignment.pkg4;

public class BooleansAssignment4 {

   
    public static void main(String[] args) {
        int x,y;
        boolean a,b,c,d,e,f;
        x=3;
        y=4;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        
     
        x=9;
        y=10;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        //< means less than, > means grater than, <= means less than or equal to, 
        //>= means greater than or equal to,== means equal to, != means not equal.
        String s1 = "Good Morning";
        String s2 = "Hi there!"; 
        String s3 = "Howdy, partner";
        String s4 = "Hey there";
        String s5 = "How is it going";
        String s6 = "Hola";
        boolean compare1 = s6 .equals(s4);
        System.out.println(compare1);
        int compare2 = s1 .compareTo (s3);
        System.out.println(compare2);
        int compare3 = s4 .compareTo (s5);
        System.out.println(compare3);
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("True and not true: " + (b1 && b2));
        System.out.println("True and not true: " + (b1 || b2));
        System.out.println("True and not true: " + (b1 && !b1));
        System.out.println("True and not true: " + (b1 && !b2));
        System.out.println("True and not true: " + (b2 && b2));
    }
    
}




