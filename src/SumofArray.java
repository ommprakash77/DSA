import java.util.*;
public class SumofArray {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the total Array Number:");
            int n = sc.nextInt();
            System.out.println("Write the Array Number:");
            int arr[] = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;

            for(int i = 0; i < n; i++) {
                sum = sum + arr[i];
            }

            System.out.println("Sum = " + sum);
        }
    }

