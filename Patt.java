class Patt{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            if(i==0){
                for(int n=i;n<5;n++){
                    System.out.print("*");
                }
            }
            
            else{
                for(int k=0;k>=0;k--){
                    System.out.print("*");
                }
                for(int l=0;l<3;l++){
                    System.out.print(" ");
                }
                for(int m=0;m>=0;m--){
                    System.out.print("*");
                }
            }
               
            System.out.println();

        }
        for(int a=0;a<5;a++){
            System.out.print("*");
        }
        

        }
    }
