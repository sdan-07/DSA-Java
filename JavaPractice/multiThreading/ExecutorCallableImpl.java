package multiThreading;

import java.util.concurrent.*;

public class ExecutorCallableImpl {
    public static void main(String[] args) {
        //using Callable to demonstrate

        Callable<Integer> sumCalc = () -> {
            int sum =0;
            for(int i=0; i<20; i++){
                if(i%2==0){
                    sum += i*2;
                }
            }
            return sum;
        };

        ExecutorService ex = Executors.newSingleThreadExecutor();
        //since i used callable i have to use future object
        Future<Integer> result = ex.submit(sumCalc);
        try {
            System.out.println(result.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ex.shutdown();
    }
}
