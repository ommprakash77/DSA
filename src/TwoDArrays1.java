
import java.util.*;
public class TwoDArrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows number:");
        int rows = sc.nextInt();
        System.out.println("Enter the cols number:");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        System.out.println("Enter the matrix type rows and cols number:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("The result is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
