import java.util.*;
public class AgeCalculator {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter birth year: ");
            int birthYear = sc.nextInt();

            int currentYear = 2026; // manually set (easy version)

            int age = currentYear - birthYear;

            System.out.println("Your age is: " + age);

            sc.close();
        }
    }

