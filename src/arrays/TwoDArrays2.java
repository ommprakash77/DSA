package arrays;
import java.util.*;
public class TwoDArrays2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows number:");
        int rows=sc.nextInt();
        System.out.println("Enter the cols number:");
        int cols=sc.nextInt();
            int [][]numbers=new int[rows][cols];
        System.out.println("Enter the rows and cols numbers:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    numbers[i][j]=sc.nextInt();
                }
            }
        System.out.println("Enter the number you want to the matrix:");
            int x=sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(numbers[i][j]==x){
                        System.out.println("x found at:("+i+","+j+")");
                    }
                }
            }
    }
}
