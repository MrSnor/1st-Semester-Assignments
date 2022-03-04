package labAssignment05;

/* Output -
Enter the value of x in radians 0.78
e^(0.78) = 2.1814722654982015
 */

import java.util.*;

public class Question12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x in radians");
		double x = sc.nextDouble();
		double sum = 0.0;
		double term = 1.0;
		for (int i = 1; sum != sum + term; i++) {
			sum = sum + term;
			term = term * x / i;
		}
		System.out.println("e^(" + x + ") = " + sum);
	}
}