package exceptionHandling;

import java.util.Scanner;

public class CustomException {
    public static int prod(int a, int b) throws Exception {
//        try {
//            if(a==0 || b==0)
//                throw new Exception("Don't enter zero");
//        } catch (Exception e) {
//            System.out.println(e);
//            return -1;
//        }
        if(a==0) throw new Exception("Dont give 0");

        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println(prod(a, b));
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
