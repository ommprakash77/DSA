import java.util.*;
public class leapyear {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int year;

            System.out.print("Enter a year: ");
            year = sc.nextInt();

            if(year % 4 == 0 || year % 400==0 && year %100!=0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }

        }
    }
