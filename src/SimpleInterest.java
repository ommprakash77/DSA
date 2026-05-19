
    import java.util.Scanner;
    public class SimpleInterest {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double p, r, t, si;

            System.out.print("Enter Principal Amount: ");
            p = sc.nextDouble();

            System.out.print("Enter Rate of Interest: ");
            r = sc.nextDouble();

            System.out.print("Enter Time: ");
            t = sc.nextDouble();

            si = (p * r * t) / 100;

            System.out.println("Simple Interest = " + si);

        }
    }
