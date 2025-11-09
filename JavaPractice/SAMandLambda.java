@FunctionalInterface    // A func interface accepts only one method
interface Abc{
    //void show(int i, String n);
    int add(int a, int b);
}

public class SAMandLambda {
    public static void main(String[] args) {
        Abc obj = (a,b) -> a+b;        //Lambda expression is used only on func interface
        int result = obj.add(6,4);
        System.out.println(result);

//        Abc obj =  (i, n) -> System.out.println("showing up..");

/*        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("showing up..");
//            }
        };*/
    }
}
