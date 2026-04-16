import java.util.*;
public class Arrays3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int size=sc.nextInt();
        int []numbers=new int[size];
        System.out.println("Enter the arrays number:");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Arrays number are:");
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}