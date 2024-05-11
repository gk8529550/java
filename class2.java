import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept two numbers as input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate and display HCF and LCM
        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    // Function to calculate HCF (GCD) using Euclidean Algorithm
    private static int calculateHCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateHCF(b, a % b);
        }
    }

    // Function to calculate LCM using HCF
    private static int calculateLCM(int a, int b) {
        int hcf = calculateHCF(a, b);
        return (a * b) / hcf;
    }
}
