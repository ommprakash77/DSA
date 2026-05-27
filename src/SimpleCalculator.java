import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;
        char operator;

        System.out.print("Enter first number:");
        a = sc.nextDouble();

        System.out.print("Enter operator(+,-,*,/):");
        operator = sc.next().charAt(0);

        System.out.print("Enter second number:");
        b = sc.nextDouble();

        if (operator == '+') {
            System.out.println("Result=" + (a + b));
    }else if(operator == '-') {
            System.out.println("Result="  +(a - b));
        }else if(operator =='*') {
            System.out.println("Result=" + (a * b));
        }else if(operator =='/') {
            System.out.println("Result=" + (a / b));
        }else{
            System.out.println("Invalied operator");

        }

    }

}
