import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
        printPascalTriangle(numRows);
        scanner.close();
    }
    public static void printPascalTriangle(int numRows) {
        for (int row = 0; row < numRows; row++) {
            int number = 1;
            for (int space = 0; space < numRows - row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print(number + " ");  
                number = number * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }
}