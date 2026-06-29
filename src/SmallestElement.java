import java.util.*;
public class SmallestElement {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array no:");
            int n = sc.nextInt();
            System.out.println("Write arrays no:");
            int arr[] = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int smallest = arr[0];

            for(int i = 1; i < n; i++) {

                if(arr[i] < smallest) {
                    smallest = arr[i];
                }
            }

            System.out.println("Smallest Element = " + smallest);
        }
    }
