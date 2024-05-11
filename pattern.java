import java.util.*;

public class pattern {
	public static void printPattern(int n)
	{
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == 1 || j == 1 || i == n - 3
					|| j == n - 3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}
