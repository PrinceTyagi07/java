import java.util.Scanner;

public class patternrect {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE RANGE");
        int n =s.nextInt();  //taking the user'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();

    }
    
}
