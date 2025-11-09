//interface A{
//    void run();
//
//    static void swim(){
//        System.out.println("Swimming in pool ...");
//    }
//}
//
//class B implements A{
//    public void run() {
//        System.out.println("Running ...");
//    }
//}

//using class
class A{
    public void run(){
        System.out.println("Running in pc");
    }
}
class B extends A{
    public void swim(){
        System.out.println("swimming in pool");
    }
}

public class inherit {
    public static void main(String[] args) {
        A obj = new B();
        obj.run();

    }
}
