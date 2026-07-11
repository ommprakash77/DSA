import java.util.*;
public class LogicalQuestion6 {
    public static int squar(int n){
        return n*n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("squar="+squar(n));
    }
}
