package arrays;
import java.util.*;
public class Stringschar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstname="OMM PRAKASH";
        String lastname="DAS";
        String fullname=firstname+" "+lastname;
        System.out.println(fullname.length());
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
