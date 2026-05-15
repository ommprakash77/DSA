import java.util.*;
public class AgeCalculator {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the currentyear:");
            int currentyear=sc.nextInt();

            System.out.print("Enter birth year: ");
            int birthYear = sc.nextInt();

            int age =currentyear - birthYear;

            System.out.println("Your age is: " +age);


        }
    }

