import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num,temp,rem,sum=0;

        System.out.println("Enter the number:");
        num=sc.nextInt();

        temp=num;
        while(temp!=0){
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if(sum==num) {
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }

        }
}
