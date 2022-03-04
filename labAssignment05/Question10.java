package labAssignment05;

/* Output -
Enter value of x to calculate sin(x): 0.78
sin(0.78) = 0.7032794208229403
 */

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x to calculate sin(x): ");
        double error = 0.000001;
        double x = sc.nextDouble();
        double term = x;
        double i = 3;
        double sum = term;
        while (Math.abs(term) > error) {
            term = (-1) * term * ((x * x) / ((i - 1) * i));
            sum = sum + term;
            i = i + 2;
        }
        System.out.println("sin(" + x + ") = " + sum);
    }
}