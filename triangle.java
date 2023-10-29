
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE RANGE:");
        int rows = s.nextInt();
        for (int i = 1; i <= rows; ++i) {
            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }
}
