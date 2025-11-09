package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecRunnableImpl {
    public static void main(String[] args) {
        Runnable prodCalc = ()->{
            int res=1;
            for (int i = 1; i <= 10; i++) {
                res *= i;
            }
            System.out.println(res);
        };

        ExecutorService ex = Executors.newSingleThreadExecutor();
        ex.execute(prodCalc);
        ex.shutdown();
    }
}
