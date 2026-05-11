import java.util.Scanner;
public class ArithmeticOperation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        System.out.println("Arithmetic operation on " + num1 + " and " + num2);

        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

        double product = num1 * num2;
        System.out.println("Product: " + product);

        if (num2 != 0) {

            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);

            double remainder = num1 % num2;
            System.out.println("Remainder: " + remainder);

        } else {

            System.out.println("Division by zero is not allowed.");
        }

    }
}
