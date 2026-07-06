import java.util.*;
public class LogicalQuestion5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the value a:");
            int a = sc.nextInt();
            System.out.println("Enter the value b:");
            int b = sc.nextInt();

            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
