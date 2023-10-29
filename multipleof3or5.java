import java.util.Scanner;

public class multipleof3or5 {
    static void multiples(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE RANGE");
        int n =s.nextInt();
        int sum =0;
        for (int i=0;i<=n;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
            else 
                continue;
    System.out.println("THE SUM OF MULTIPLE OF 3 OR 5 "+sum);
    s.close();            

        }
    }
    public static void main(String[]args){
        multiples();
    }
    
    
}
