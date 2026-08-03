import java.util.*;
public class FunctionGreaterNumber {
    public static int greater(int a,int b) {
        if (a > b) {
            System.out.println("a is greater");
            return a;
        } else {
            System.out.println("b is greater");
            return b;
        }
    }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value a:");
            int a=sc.nextInt();
            System.out.println("Enter the value b:");
            int b=sc.nextInt();
            System.out.println(greater(a,b));

    }
}
