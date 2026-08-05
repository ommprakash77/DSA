import java.util.*;
public class HollowRectrangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value n:");
        int n=sc.nextInt();
        System.out.println("Enter the value m:");
        int m=sc.nextInt();
        System.out.println("The Result is:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
