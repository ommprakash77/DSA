import java.util.*;
public class Arrays7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        System.out.println("Enter the Array size name:");
        String [] names=new String[size];
        for(int i=0;i<size;i++){
            names[i]=sc.next();
        }
        System.out.println("The result is");
        for(int i=0;i<size;i++){
            System.out.println("Name "+(i+1)+" is:"+names[i]);
        }

    }
}
