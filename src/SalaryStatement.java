import java.util.Scanner;
public class SalaryStatement {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double basicPay, da, hra, ta, grossSalary;

            // Input values
            System.out.print("Enter Basic Pay: ");
            basicPay = sc.nextDouble();

            System.out.print("Enter Dearness Allowance (DA): ");
            da = sc.nextDouble();

            System.out.print("Enter House Rent Allowance (HRA): ");
            hra = sc.nextDouble();

            System.out.print("Enter Travel Allowance (TA): ");
            ta = sc.nextDouble();

            // Calculate gross salary
            grossSalary = basicPay + da + hra + ta;

            // Display salary statement
            System.out.println("\n------ Salary Statement ------");
            System.out.println("Basic Pay               : " + basicPay);
            System.out.println("Dearness Allowance (DA): " + da);
            System.out.println("House Rent Allowance   : " + hra);
            System.out.println("Travel Allowance (TA)  : " + ta);
            System.out.println("Gross Salary     (GS)      : " + grossSalary);
        }
    }

