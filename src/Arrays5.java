import java.util.*;
public class Arrays5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size=sc.nextInt();
        int []numbers=new int[size];
        System.out.println("Enter the array number:");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search the number then result find out the  index:");
        int x=sc.nextInt();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] ==x){
                System.out.println("x found at index: " +  i);
            }
        }
    }

}
