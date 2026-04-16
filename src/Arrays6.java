import java.util.*;
public class Arrays6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        int []numbers=new int[size];
        System.out.println("Enter the Arrays numbers:");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the numbers you want to search:");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(numbers[i]==x){
                System.out.println("x found at x:" +  i);
            }
        }
    }

}
