import java.util.*;
public class FactorialProgram{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num;
            int fact = 1;

            System.out.print("Enter a number: ");
            num = sc.nextInt();

            for(int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial = " + fact);
        }
    }

