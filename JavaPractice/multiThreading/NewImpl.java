package multiThreading;

class ABC implements Runnable{
    private int count;
    void increase(){
        count ++;
        System.out.println(count);
    }
    public void run(){increase();}
}

class XYZ extends ABC implements Runnable{
    public void run(){increase();}
}

public class NewImpl {
    public static void main(String[] args) {
        ABC abc = new ABC();
        XYZ xyz = new XYZ();
        Thread t1 = new Thread(abc);
        Thread t2 = new Thread(xyz);
        t1.start();
        t2.start();

        abc.increase();
        xyz.increase();
    }
}
