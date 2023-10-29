import java.util.Scanner;

public class ReverseRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
5
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
