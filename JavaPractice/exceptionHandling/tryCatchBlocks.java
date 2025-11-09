package exceptionHandling;

public class tryCatchBlocks {
    public static void main(String[] args) {
        String s = null;
        int[] arr = new int[5];

        try {
            System.out.println(s.charAt(2));
            System.out.println(arr[6]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The problem is : " + e);
        }catch (NullPointerException e) {
            System.out.println("The problem is : " + e);
        }

        System.out.println("byee");
    }
}
