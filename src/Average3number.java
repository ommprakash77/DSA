import java.util.*;
public class Average3number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value a:");
        int a=sc.nextInt();
        System.out.println("Enter the value b:");
        int b=sc.nextInt();
        System.out.println("Enter the value c:");
        int c=sc.nextInt();
        Double average=(a+b+c)/3.0;
        System.out.println("The average of 3 number is:"+average);
    }
}
