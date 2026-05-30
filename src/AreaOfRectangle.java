import java.util.*;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double l,b,Area;

        System.out.print("Enter the value l:");
        l=sc.nextDouble();
        System.out.print("Enter the value b:");
        b=sc.nextDouble();

        Area=l*b;
        System.out.print("Area of rectangle:"+Area);
    }
}
