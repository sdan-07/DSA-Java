import java.util.Scanner;

public class Search_in_matrix{
    public static int [][] numbs = new int[4][5];

    public static void search(int x){
        for (int i=0; i<2; i++){
            for (int j=0; j<5; j++){
                if(numbs[i][j] == x){
                    System.out.println("Found at row "+(i+1)+" and column "+(j+1));
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //take user input
        for (int i=0; i<2; i++){
            for (int j=0; j<5; j++){
                numbs[i][j] = sc.nextInt();
            }
        }
        search(7);
        sc.close();
    }
}