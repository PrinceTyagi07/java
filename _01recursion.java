import java.util.Scanner;

public class _01recursion {
    // function which call only columns
    static void rows(int n) {
        if (n == 0) {
            return;
        } else {
            rows(n - 1);
            System.out.println();
            columns(n);
        }
    }

    // function which controls the no of *
    static void columns(int x) {
        if (x == 0) {
            return;

        } else {
            columns(x - 1);
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n = sc.nextInt();
        rows(n);
        sc.close();

    }
}
