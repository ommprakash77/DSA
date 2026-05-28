import java.util.*;
public class Recursion1To3 {
    public static void printNum(int n){
        if(n<=3){
            System.out.println(n);
            printNum(n+1);
        }
    }
    public static void main(String[] args) {
        printNum(0);

    }
}
