import java.util.*;
public class Clearbits {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;

        int notBitmask=~(bitmask);
        int newNumber=notBitmask &n;
        System.out.println(newNumber);
    }
}
