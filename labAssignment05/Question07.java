package labAssignment05;

/* Output -
No. of terms is 8
Sum is -8
 */

import java.util.*;
public class Question07 {
    public static void main(String[] args) {
        
        int Nth = 8;

        int sum = 0;
        // 'an' term
        int an = 0;
        for (int count = 1; count <= Nth; count++) {
            if (count % 2 == 1)
                an = (2 * count) - 1;
            else an = -((2 * count) - 1);
            sum += an;

        }
        System.out.println("No. of terms is " + Nth);

        System.out.println("Sum is " + sum);

    }
}