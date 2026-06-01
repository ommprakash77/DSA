import java.util.*;
public class SeniorLargest3Number {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value a:");
    int a = sc.nextInt();
        System.out.print("Enter the value b:");
    int b = sc.nextInt();
        System.out.print("Enter the value c:");
    int c = sc.nextInt();


    int max = a;

    if(b>max){

        max = b;
    }
    if(c>max){
        max = c;
    }
    System.out.println("Largest number is:"+max);
}
}
