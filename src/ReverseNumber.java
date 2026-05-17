import java.util.Scanner;
public class ReverseNumber {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num, reverse = 0, rem;

            System.out.print("Enter a number: ");
            num = sc.nextInt();

            while(num != 0) {

                rem = num % 10;
                reverse = reverse * 10 + rem;
                num = num / 10;

            }

            System.out.println("Reverse Number = " + reverse);

        }
    }

