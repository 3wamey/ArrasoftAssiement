import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input two numbers X and Y
        long X = scanner.nextLong();
        long Y = scanner.nextLong();

        // Calculate sum, multiplication, and subtraction
        long sum = X + Y;
        long mult = X * Y;
        long sub = X - Y;

        // Print the results in the desired format
        System.out.println(X + " + " + Y + " = " + sum);
        System.out.println(X + " * " + Y + " = " + mult);
        System.out.println(X + " - " + Y + " = " + sub);


    }
        }




