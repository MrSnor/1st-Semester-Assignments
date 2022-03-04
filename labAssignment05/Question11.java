package labAssignment05;

/* Output -
Enter value of x to calculate cos(x): 0.78
cos(0.78) = 0.7109135608779177
 */

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x to calculate cos(x):");
        double error = 0.00001;
        double x = sc.nextDouble();
        double term = 1;
        double i = 2;
        double sum = term;
        while (Math.abs(term) > error) {
            term = (-1) * term * ((x * x) / ((i - 1) * i));
            sum = sum + term;
            i = i + 2;
        }
        System.out.println("cos(" + x + ") = " + sum);
    }
}