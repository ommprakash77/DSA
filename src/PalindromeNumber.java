import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num, temp, rem, reverse = 0;

            System.out.print("Enter a number: ");
            num = sc.nextInt();

            temp = num;

            while(num != 0) {
                rem = num % 10;
                reverse = reverse * 10 + rem;
                num = num / 10;
            }

            if(temp == reverse) {
                System.out.println("Palindrome Number");
            } else {
                System.out.println("Not a Palindrome Number");
            }
        }
    }
