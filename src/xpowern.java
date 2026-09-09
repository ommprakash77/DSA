import java.util.*;
public class xpowern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value x:");
        int x=sc.nextInt();

        System.out.println("Enter the value n:");
        int n=sc.nextInt();

        int result =1;
        for(int i=1;i<=n;i++){
            result =result * x;
        }
        System.out.println("The Result is:"+result);
    }
}
