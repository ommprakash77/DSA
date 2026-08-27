import java.util.*;
public class LargestTWOdarray {
    public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter rows:");
                int rows = sc.nextInt();

                System.out.println("Enter cols:");
                int cols = sc.nextInt();

                int[][] numbers = new int[rows][cols];

                System.out.println("Enter the 2D array:");

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        numbers[i][j] = sc.nextInt();
                    }
                }

                int largest = numbers[0][0];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {

                        if (numbers[i][j] > largest) {
                            largest = numbers[i][j];
                        }
                    }
                }

                System.out.println("Largest number is: " + largest);
            }
        }
