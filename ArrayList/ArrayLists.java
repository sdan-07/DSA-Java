import java.util.ArrayList; 

public class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        //add to list
        list1.add(25);
        list1.add(96);
        list1.add(50);
        list1.add(70);
        
        //remove el
        list1.remove(1);

        //get el
        System.out.print(list1.get(2));
    }
}