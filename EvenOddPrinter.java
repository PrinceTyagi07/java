public class EvenOddPrinter {
    public static void printEvenOddRecursive(int start, int end) {
        if (start > end) {
            return;
        }

        if (start % 2 == 0) {
            System.out.println("Even: " + start +" ");
        } else {
            System.out.print("Odd: " + start +" ");
        }

        printEvenOddRecursive(start + 1, end);
    }

    public static void main(String[] args) {
        int start = 0;
        int end = 100;
        printEvenOddRecursive(start, end);
    }
}
