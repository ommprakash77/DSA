import java.util.*;
public class Logicalquestion4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number:");
            int num = sc.nextInt();

            if ((num & 1) == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }

