package labAssignment05;

/* Output -
Enter the number whose factorial is to be found:5
Factorial of the number is :120
 */

import java.util.*;

public class Question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial is to be found:");
        int n = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("Factorial of the number is :" + f);
    }
}