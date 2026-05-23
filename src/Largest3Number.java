import java.sql.SQLOutput;
import java.util.*;
public class Largest3Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter the first number:");
        a=sc.nextInt();

        System.out.println("Enter the second number:");
        b=sc.nextInt();

        System.out.println("Enter the thid number:");
        c=sc.nextInt();

        if(a>b && a>c) {
            System.out.println("Largest number is:" + a);
        }else if(b>a && b>c) {
            System.out.println("Largest number is:" + b);
        }else{
            System.out.println("Largest number is:"+c);
        }
    }
}
