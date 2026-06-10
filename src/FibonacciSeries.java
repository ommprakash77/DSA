import java.util.*;
    public class FibonacciSeries {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n;
            int a = 0, b = 1, c;

            System.out.print("Enter number of terms: ");
            n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                System.out.print(a + " ");

                c = a + b;
                a = b;
                b = c;
            }
        }
    }

