import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Declare variables
                long A, B, C;

                // Read inputs A, B, and C
                A = scanner.nextLong();
                B = scanner.nextLong();
                C = scanner.nextLong();

                // Check if A is the largest
                if (A >= B && A >= C) {
                    if (B > C) {
                        System.out.println(C + " " + A);
                    } else {
                        System.out.println(B + " " + A);
                    }
                }

                // Check if B is the largest
                else if (B >= A && B >= C) {
                    if (A > C) {
                        System.out.println(C + " " + B);
                    } else {
                        System.out.println(A + " " + B);
                    }
                }

                // Check if C is the largest
                else if (C >= A && C >= B) {
                    if (A > B) {
                        System.out.println(B + " " + C);
                    } else {
                        System.out.println(A + " " + C);
                    }
                }

                // Close the scanner
                scanner.close();
            }
        }





