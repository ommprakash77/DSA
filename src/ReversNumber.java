import java.util.*;
public class ReversNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,rem,reverse=0;

        System.out.print("Enter the number:");
        num=sc.nextInt();

        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println("Reverse number:"+reverse);
    }
}
