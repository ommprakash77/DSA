import java.util.*;
public class DuckNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            int temp = num;

            boolean isDuck = false;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit == 0) {
                    isDuck = true;
                    break;
                }

                temp = temp / 10;
            }

            if (isDuck) {
                System.out.println("Duck Number");
            } else {
                System.out.println("Not Duck Number");
            }
        }
    }

