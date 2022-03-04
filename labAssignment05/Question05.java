package labAssignment05;

/* Output -
Enter the number of terms you want to enter: 4
Enter your numbers:4 4 4 4
The sum of the numbers are: 16
The average of the numbers are: 4.0
 */

import java.util.*;

public class Question05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of terms you want to enter: ");
		double x = input.nextInt();
		int i, z;
		int sum = 0;
		double average = 0;
		System.out.print("Enter your numbers:");
		for (i = 1; i <= x; i++) {
			z = input.nextInt();
			sum = sum + z;
			average = sum / x;
		}
		System.out.println("The sum of the numbers are: " + sum);
		System.out.println("The average of the numbers are: " + average);
	}
}