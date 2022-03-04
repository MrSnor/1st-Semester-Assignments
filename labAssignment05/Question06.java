package labAssignment05;

/* Output -
Enter the number of terms:3
Enter the terms one by one:2 3 5
Harmonic mean = 2.9032258064516134
 */

import java.util.*;

public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        double n = sc.nextDouble();
        double b = 0;
        System.out.print("Enter the terms one by one:");
        for (int i = 1; i <= n; i++) {
            double a = sc.nextDouble();
            b = b + (1 / a);
        }
        double hm = (n) / (b);
        System.out.println("Harmonic mean = " + hm);
    }
}