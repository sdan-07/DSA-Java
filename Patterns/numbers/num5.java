public class num5 {
    public static void main(String[] args) {
        // 1 3 5 7 
        //   9 1 3 
        //     5 7  
        //       9
        int n = 4;
        int count = 1;
        
        for(int i=n; i>=1; i--){
            for(int j=1; j<= n-i; j++){    //spaces
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                    System.out.print(count);
                    count = count + 2;
                    if(count > 9){
                        count = 1;
                    }
            }
            System.out.println();
        }
    }
}
