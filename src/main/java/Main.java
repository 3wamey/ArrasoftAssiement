import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input: two numbers A and B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calculate the division result
        double result = (double) A / B;

        // Calculate and print floor, ceil, and round with the required format
        System.out.println("floor " + A + " / " + B + " = " + (int) Math.floor(result));
        System.out.println("ceil " + A + " / " + B + " = " + (int) Math.ceil(result));
        System.out.println("round " + A + " / " + B + " = " + Math.round(result));

    }
        }




