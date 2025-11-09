package multiThreading;

class A implements Runnable{
    public void print(){
        for(int i=0; i<10; i++) System.out.println("hi");
        //try {Thread.sleep(5);} catch (InterruptedException e) {e.printStackTrace();}
    }

    public void run(){print();}
}


class B extends A implements Runnable {
    @Override
    public void print() {
        for (int i = 0; i < 10; i++) System.out.println("hello");
        //try {Thread.sleep(5);} catch (InterruptedException e) {e.printStackTrace();}
    }

    public void run() {print();}
}

public class implementation {
    public static void main(String[] args) {
//       Runnable printHi = () -> {
//           for(int i=0; i<10; i++) System.out.println("hi");
//           try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
//       };
//
//        Runnable printHello = () -> {
//            for(int i=0; i<10; i++) System.out.println("hello");
//            try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
//        };
//
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.setPriority(5);

        t1.start();
        t2.start();





    }
}
