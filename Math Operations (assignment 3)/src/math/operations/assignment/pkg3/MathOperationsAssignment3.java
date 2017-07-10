/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.operations.assignment.pkg3;

public class MathOperationsAssignment3 {
     public static void main( String[] args ) {
         int p,q,r,s,t,u,d,f,g;
          double a,b,c;
          
          String first, second, together;
          u = 3;
          p = 8;
          q = 25;
          r = p + 10;
         System.out.println( "p+10 is " + r );
         r = p + 10 * 30;
         System.out.println( "p+10*30 is " + r );
         System.out.println( "p is " + p + ", q is " + q );
         r = q / 5;
         System.out.println( "q/5 is " + r );
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
        r = p + u;
         System.out.println( "p+q is " + r );
        a = 1.1;
         System.out.println( "a-- is " + a );
         b = a*a;
         System.out.println( "a++ is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();

         first = "peanut butter";
         second = " and jelly";
         together = first + second;
         System.out.println( together );
     }
}
