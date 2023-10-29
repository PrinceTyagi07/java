import java.util.Scanner;

// !check the num is   armstrong or not  using function 
public class fun1 {
    // Function to calculate the power of a number
    public static int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // claculate the nom of digits
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = countDigits(num);

        for (int i = num; i > 0; i /= 10) {
            int digit = i % 10;
            sum += calculatePower(digit, numDigits);
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        // Change this to the number you want to check
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");

        int numberToCheck = s.nextInt();
        ;
        if (isArmstrong(numberToCheck)) {
            System.out.println(numberToCheck + " is an Armstrong number.");
        } else {
            System.out.println(numberToCheck + " is not an Armstrong number.");
        }
        s.close();
    }
    
}
