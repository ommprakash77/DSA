import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age=sc.nextInt();
        if(age>18) {
            System.out.println("You are adult for voting");
        }else{
            System.out.println("You are not adult for voting");
        }
    }
}
