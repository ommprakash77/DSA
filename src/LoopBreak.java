import java.util.*;
public class LoopBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i >= 5) {
                break;
            }
        }
    }
}

