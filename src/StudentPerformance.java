import java.util.*;
public class StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String yourname;
        String yourschoolname;
        int subject1MIL, subject2ENG, subject3TLH, subject4GSC, subject5MATH, subject6SSC;
        float totalmarks, aggregatepercentage;

        System.out.print("Enter your name: ");
        yourname = sc.nextLine();

        System.out.print("Enter your school name: ");
        yourschoolname = sc.nextLine();

        System.out.print("Enter subject1 MIL: ");
        subject1MIL = sc.nextInt();

        System.out.print("Enter subject2 ENG: ");
        subject2ENG = sc.nextInt();

        System.out.print("Enter subject3 TLH: ");
        subject3TLH = sc.nextInt();

        System.out.print("Enter subject4 GSC: ");
        subject4GSC = sc.nextInt();

        System.out.print("Enter subject5 MATH: ");
        subject5MATH = sc.nextInt();

        System.out.print("Enter subject6 SSC: ");
        subject6SSC = sc.nextInt();

        totalmarks = subject1MIL + subject2ENG + subject3TLH + subject4GSC + subject5MATH + subject6SSC;
        aggregatepercentage = totalmarks / 6;

        System.out.println("\n------ STUDENT PERFORMANCE ------\n");
        System.out.println("Name: " + yourname);
        System.out.println("School: " + yourschoolname);
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Percentage: " + aggregatepercentage);

        if (subject1MIL < 30 || subject2ENG < 30 || subject3TLH < 30 || subject4GSC < 30 || subject5MATH < 30 || subject6SSC < 30) {
            System.out.println("RESULT = FAIL");
        } else {
            System.out.println("RESULT = PASS");
        }

        if (aggregatepercentage >= 90) {
            System.out.println("Grade: A+");
        } else if (aggregatepercentage >= 80) {
            System.out.println("Grade: A");
        } else if (aggregatepercentage >= 70) {
            System.out.println("Grade: B+");
        } else if (aggregatepercentage >= 60) {
            System.out.println("Grade: B");
        } else if (aggregatepercentage >= 50) {
            System.out.println("Grade: C");
        } else if (aggregatepercentage >= 40) {
            System.out.println("Grade: D");
        } else if (aggregatepercentage >= 30) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F (Fail)");

        }
    }
}