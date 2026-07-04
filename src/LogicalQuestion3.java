import java.util.*;
public class LogicalQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a:");
         int a=sc.nextInt();
        System.out.println("Enter the value b:");
         int b=sc.nextInt();

         if((a ^ b)==0) {
             System.out.println("Equal");
         }else{
             System.out.println("Not Equal");
         }
    }
}