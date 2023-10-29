import java.util.Scanner;

public class hollowrhom {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();  //taking the user'
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n-1; j++) {
                System.out.print(" ");
            }
    
            for (int j = 0; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();

    }
    
}
