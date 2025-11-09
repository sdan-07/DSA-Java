public class basicStack{
    public static class Node{
        int data;
        Node next;
    }
    public static class Stack{
        Node top;
        int size = 0;

        void push(int data){
            if(size >= 5){
                System.out.println("stack overflow.");
            }else{
                Node newElem = new Node();
                newElem.data = data;
                newElem.next = top;
                top = newElem;
                size++;
            }
        }

        void pop(){
            if(size==0){
                System.out.println("Stack underflow.");
            }else{
                top = top.next;
                size--;
            }
        }
        void peek(){
            System.out.println(top.data);
        }

        void print(){
            Node temp = top;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args){
        Stack ST = new Stack();
        ST.push(25);
        ST.push(50);
        ST.push(64);
        ST.push(98);
        ST.pop();
        
        // ST.print();
        ST.peek();
    }
}