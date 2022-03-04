package labAssignment05;

/* Output -
Enter an integer, the input ends if it is 0: 1 2 -1 3 0
The number of positives is 3
The number of negatives is 1
The total is 5.0
The average is 1.25
Enter an integer, the input ends if it is 0: 0
No numbers are entered except 0
 */

import java.util.Scanner;

public class Question04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int positive = 0;
		int negative = 0;
		int total = 0;
		int count = 0;
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();
		if (number == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}
		while (number != 0) {
			if (number > 0)
				positive++;
			else
				negative++;
			total += number;
			count++;
			number = input.nextInt();
		}
		double average = total / count;
		System.out.println("The number of positive is " + positive + "\nThe number of negatives is " + negative
				+ "\nThe total is " + total + "\nThe average is " + average);
	}
}