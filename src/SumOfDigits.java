import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b,c,sum;

        System.out.print("Enter the value a:");
        a=sc.nextInt();

        System.out.print("Enter the value b:");
        b=sc.nextInt();

        System.out.print("Enter the value c:");
        c=sc.nextInt();

        sum=a+b+c;

        System.out.print("sum of Digits: "+sum);
    }
}
