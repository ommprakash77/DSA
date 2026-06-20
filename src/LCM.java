import java.util.*;
public class LCM {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number a:");
            int a = sc.nextInt();
            System.out.println("Enter the number b:");
            int b = sc.nextInt();

            int max = (a > b) ? a : b;

            while(true) {

                if(max % a == 0 && max % b == 0) {
                    System.out.println("LCM = " + max);
                    break;
                }

                max++;
            }
        }
    }

