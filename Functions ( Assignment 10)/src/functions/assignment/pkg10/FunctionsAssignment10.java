/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions.assignment.pkg10;

public class FunctionsAssignment10 {

    public static void main(String[] args) {

        //this part will test the functions
        System.out.println(" (0,-3) to (-1,-7) has slope " + slope(0, -3, -1, -7));
        System.out.println(" (2,8) to (4,-4) has slope " + slope(2, 8, 4, -4));

        System.out.println(" (0,-3) to (-1,-7) has distance " + distance(0, -3, -1, -7));
        System.out.println(" (2,8) to (4,-4) has distance " + distance(2, 8, 4, -4));

    }

    public static double slope(int x1, int y1, int x2, int y2) {
        // put your code here and change the return value below
        double slope1 = (y2 - y1);
        double slope2 = (x2 - x1);
        return slope1/slope2;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        // put your code here and change the return value below
        double dist1 = x2-x1;
        double dist2 = y2-y1;
        double dist3 = Math.pow(x2-x1,2);
        double dist4 = Math.pow(y2-y1,2);
        double dist5 = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
        
        return 0;
    }
}

