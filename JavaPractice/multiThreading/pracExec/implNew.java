package multiThreading.pracExec;

import java.util.concurrent.*;

public class implNew {
    public static void main(String[] args) {
        Callable<Integer> SumCalc = () -> {
            int sum=0;
            for(int i=10; i>=1; i--){
                sum = sum + i;
            }
            return sum;
        };

        ExecutorService ex = Executors.newSingleThreadExecutor();
        //ex.submit(SumCalc);
        Future<Integer> res = ex.submit(SumCalc);
        try {
            System.out.println(res.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
