import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num,count=0;

        System.out.println("Enter a number:");
        num=sc.nextInt();

        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("Number of digits:"+count);

    }
}
