package labAssignment05;

/* Output -
120 150 180 210 240 270 300 330 360 390 
420 450 480 510 540 570 600 630 660 690
720 750 780 810 840 870 900 930 960 990
 */

public class Question03 {
	public static void main(String args[]) {
		int c = 0;
		for (int a = 100; a <= 1000; a++) {
			if (a % 5 == 0 && a % 6 == 0) {
				System.out.print(a + " ");
				c++;
			}
			if (c == 10) {
				c = 0;
				System.out.println();
			}
		}
	}
}