import java.util.*;
public class CheckSortedAscendingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the size arrya:");
        int size=sc.nextInt();
        int[]number=new int[size];
        for(int i=0;i<size;i++){
        number[i]=sc.nextInt();
        }

        boolean isAscending=true;
    for(int i=0;i<number.length-1;i++){
        if(number[i]>number[i+1]){
            isAscending=false;
        }
    }

    if(isAscending) {
        System.out.println("The array is sorted in ascending order");
    }else{
        System.out.println("The array is not sorted in ascending order");
    }

    }
}
