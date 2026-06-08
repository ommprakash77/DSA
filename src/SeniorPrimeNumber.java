import java.util.Scanner;
public class SeniorPrimeNumber {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num;
            boolean isPrime = true;

            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if(num <= 1) {
                isPrime = false;
            } else {

                for(int i = 2; i < num; i++) {

                    if(num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if(isPrime) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");
            }
        }
    }
