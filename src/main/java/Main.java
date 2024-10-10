import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

               /* V. Comparison   */





                Scanner scanner = new Scanner(System.in);

                // Declare variables
                int A, B;
                char C;

                // Read inputs A, C (comparison symbol), and B
                A = scanner.nextInt();
                C = scanner.next().charAt(0);
                B = scanner.nextInt();

                // Perform the comparison based on the value of C
                if (C == '<') {
                    if (A < B) {
                        System.out.println("Right");
                    } else {
                        System.out.println("Wrong");
                    }
                } else if (C == '>') {
                    if (A > B) {
                        System.out.println("Right");
                    } else {
                        System.out.println("Wrong");
                    }
                } else if (C == '=') {
                    if (A == B) {
                        System.out.println("Right");
                    } else {
                        System.out.println("Wrong");
                    }
                }


            }
        }


