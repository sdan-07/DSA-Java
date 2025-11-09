package multiThreading;

public class implm2 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int prod(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Runnable sum = ()-> {
            System.out.println(sum(5,12));
        };
        Runnable prod = ()-> {
            System.out.println(prod(5,12));
        };

        //thread running
        Thread t1 = new Thread(sum);
        Thread t2 = new Thread(prod);
        t1.start(); t2.start();

    }
}
