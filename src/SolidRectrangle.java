import java.util.*;
public class SolidRectrangle{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number n:");
            int n=sc.nextInt();
            System.out.println("Enter the number m:");
            int m=sc.nextInt();
            System.out.println("The result is:");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){

                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }