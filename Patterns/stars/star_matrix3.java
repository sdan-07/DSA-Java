public class star_matrix3 {
    public static void main(String[] args) {
        int n = 4;
        //       *
        //     * *
        //   * * *
        // * * * *
        
        for(int i=1; i<=n;i++){
            
            //*Print Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //*Print Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
