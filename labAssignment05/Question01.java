package labAssignment05;

import java.util.*;

/* Output - 
Enter the value of n:5
2^0=1
2^1=2
2^2=4
2^3=8
2^4=16
2^5=32
 */

public class Question01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.print("Enter the value of n:");
		n = sc.nextInt();
		for (i = 0; i <= n; i++) {
			int r = (int) Math.pow(2, i);
			System.out.println(2 + "^" + i + "=" + r);
		}
	}
}