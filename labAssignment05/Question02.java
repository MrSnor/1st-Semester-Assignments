package labAssignment05;

import java.util.*;

/* Output -
Enter the number of students whose mark you want to enter :3
Enter the mark one by one :54
Enter the mark one by one :32
Enter the mark one by one :79
The number of students who passed are : 2
 */

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, c = 0;
        System.out.print("Enter the number of students whose mark you want to enter :");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print("Enter the mark one by one :");
            int num = sc.nextInt();
            if (num >= 40)
                c++;
        }
        System.out.print("The number of students who passed are : " + c);
    }
}