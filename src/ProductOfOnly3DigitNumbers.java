import java.util.*;
public class ProductOfOnly3DigitNumbers {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Digits:");
            int num = sc.nextInt();

            int last = num % 10;
            int middle = (num / 10) % 10;
            int first = num / 100;

            int product = first * middle * last;

            System.out.println("Product = " + product);
        }
    }

