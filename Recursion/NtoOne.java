public class NtoOne{
    public static void main(String[] args){
        System.out.println("::Factorial of nth term::");
        System.out.println(fact(5));
    }

    public static int fact(int n){
        // if(n == 0||n==1){
        //     return 1;
        // }
        
        // return n * fact(n-1);

        return n == 0 || n == 1 ? 1 : n * fact(n - 1);
    }
}