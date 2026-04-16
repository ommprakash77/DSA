import java.util.*;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number I can cheak Even and Odd:");
        int x=sc.nextInt();
        if(x%2==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
