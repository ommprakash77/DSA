import java.util.*;
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value a:");
        int a=sc.nextInt();
        System.out.println("Enter the value b:");
        int b=sc.nextInt();

        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("The result of GCD:");
        System.out.println(a);
    }
}
