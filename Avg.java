/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Aravind
 */
public class Avg {

    public static void main(String[] args) {
        // TODO code application logic here
        int sum1 = 0, x = 0, avg1;
        int sum2 = 0, y = 0, avg2;
        System.out.println("How many no.s u want to check:");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        System.out.println("Enter the no.s:");
        Scanner s2 = new Scanner(System.in);
        int[] a = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = s2.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            sum1 = sum1 + a[i];
            x++;
        }
        for (int i = n / 2; i < n; i++) {
            sum2 = sum2 + a[i];
            y++;
        }
        avg1 = sum1 / x;
        avg2 = sum2 / y;
        if (avg1 == avg2) {
            System.out.println("Averages are same");
        } else {
            System.out.println("Averages are not same");
        }
    }
}
