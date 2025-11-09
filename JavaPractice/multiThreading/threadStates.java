package multiThreading;

public class threadStates {
    public static void main(String[] args) throws InterruptedException {
        Runnable txt1 = () -> {for(int i=0; i<50; i++) System.out.println("Go Away");};
        Runnable txt2 = () -> {for(int i=0; i<50; i++) System.out.println("Come in");};

        Thread t1 = new Thread(txt1);
        Thread t2 = new Thread(txt2);
        t1.start();
        txt1.wait();
        txt1.notify();
        t2.start();
    }
}
