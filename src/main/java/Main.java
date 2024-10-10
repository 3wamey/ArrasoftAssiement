import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Define the value of Pi
        double PI = 3.141592653;

        // Input the radius
        double R = scanner.nextDouble();

        // Calculate the area of the circle
        double area = PI * R * R;

        // Print the result with 9 digits after the decimal point
        System.out.printf("%.9f\n", area);

    }
        }




