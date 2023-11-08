import java.util.Scanner;

public class _02sum {
    static int sum(int n) {
        if (n == 0) {
            return 0;

        } else {
            return (n + sum(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Digit");
        int n = sc.nextInt();
        System.out.println(sum(n));
        
        sc.close();
    }
}
