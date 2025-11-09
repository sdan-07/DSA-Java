package multiThreading;

import java.util.concurrent.*;
class sumCalculation{
    public static void doubleEven(){
        int sum =0;
        for(int i=0; i<20; i++){
            if(i%2==0){
                sum += i*2;
            }
        }
        System.out.println("Sum of even nums: "+sum);
    }
    public void call(){ doubleEven(); }
}

class factCalculation{
    public static void factorial(){
        int f=1;
        for(int i=1; i<=6; i++) {
            f = i * f;
            System.out.println(f);
        }
    }
    public void call(){ factorial(); }
}

public class ExecutorImpl {
    public static void main(String[] args) {
        /* using executor framework for multi threading
           two programs- doubling even nums till 20 and return sum
           and factorial till 10
         */

        sumCalculation sc = new sumCalculation();
        factCalculation fc = new factCalculation();

        ExecutorService ex = Executors.newFixedThreadPool(2);

        long startTime = System.currentTimeMillis();

        ex.execute(()->sc.call());
        ex.execute(()->fc.call());
        ex.shutdown();

        System.out.println("Time took: "+(System.currentTimeMillis()-startTime)+"ms");
    }
}
