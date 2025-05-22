/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author user
 */
public class  Dart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner scn = new Scanner(System.in);
        System.out.println("Dart Game!");
        System.out.println("Enter the number of darts to be thrown:");
        int n = scn.nextInt();
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;

        for (int i = 1; i <= n; i++) {
            double m = ((Math.random() * 20) - 11);
            double l = ((Math.random() * 20) - 11);
            m = (int) m;
            l = (int) l;
            double x = l / 10.0;
            double y = m / 10.0;

            System.out.println(" ");
            System.out.println("Dart " + i);
            if (x > 0 && y < 0) {
                System.out.println("Coordinates:" + "(" + x + "," + " " + y + ")" + "Region: F ");
                a++;
            } else if (x == y || x + y == 1 || y == 0 || x == 0 || x == 1 || x == -1 || y == 1 || y == -1) {
                System.out.println("Coordinates:" + "(" + x + "," + " " + y + ")" + "Region: Undecided");
                e++;
            } else if (x < 0 && y > 0) {
                System.out.println("Coordinates:" + "(" + x + "," + " " + y + ")" + "Region: C ");
                b++;
            } else if ((x > 0 && y > 0) && (x + y < 1)) {

                System.out.println("Coordinates:" + "(" + x + "," + " " + y + ")" + "Region: A ");
                d++;

            } else if ((x > 0 && y > 0) && (x + y > 1)) {

                System.out.println("Coordinates:" + "(" + x + "," + " " + y + ")" + "Region: B");
                c++;

            } else if ((x < 0 && y < 0) && (x < y)) {

                System.out.println("Coordinates:" + "(" + x + "," + " " + y + ")" + "Region: D");
                f++;

            } else if ((x < 0 && y < 0) && (y < x)) {

                System.out.println("Coordinates:" + "(" + x + "," + " " + y + ")" + "Region: E");
                g++;

            } else {
                System.out.println("The zone has not been found.");
            }
        }
        int total = (a + b + c + d + e + f + g);

        double p = 100.00 / total;
        int y = (int) (p * 10);
        double k = y / 10.0;

        System.out.println("  ");
        System.out.println("Region statistics: ");
        System.out.println("A: " + d + " darts " + "(" + d * k + "%)");
        System.out.println("B: " + c + " darts " + "(" + c * k + "%)");
        System.out.println("C: " + b + " darts " + "(" + b * k + "%)");
        System.out.println("D: " + f + " darts " + "(" + f * k + "%)");
        System.out.println("E: " + g + " darts " + "(" + g * k + "%)");
        System.out.println("F: " + a + " darts " + "(" + a * k + "%)");
        System.out.println("Undecided: " + e + " darts " + "(" + e * k + "%)");
    }
}
