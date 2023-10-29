import java.util.Scanner;

public class perfectsquare {
    static void psq(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE RANGE");
        int n =s.nextInt();
        int i =2;
        for(; i<=n/2;i++){
            if(i*i==n){
                System.out.println("IT IS AN PERFECT SQWUARE");
                break;
            }

        }
        if(i>n/2){
            System.out.println("IT IS NOT AN PERFECT SQUARE");

        }

    }
    public static void main(String[]args){
        psq();
    }
}
