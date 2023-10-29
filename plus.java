public class plus {
    public static void main(String[] args) {
        int size = 10; // You can change the size of the plus pattern as needed
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == (size / 2) + 1 || j == (size / 2) + 1) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
}
