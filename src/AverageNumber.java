import java.util.*;
public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, e, average;

        System.out.print("Enter the First number:");
        a = sc.nextDouble();

        System.out.print("Enter the Second number:");
        b = sc.nextDouble();

        System.out.print("Enter the Third number:");
        c = sc.nextDouble();

        System.out.print("Enter the Four number:");
        d = sc.nextDouble();

        System.out.print("Enter the Five number:");
        e = sc.nextDouble();

        // sum = a + b + c + d + e;
        average =(a+b+c+d+e)/ 5.0;

        System.out.print("Average number:" + average);


    }
}
