public class doubleLL {
    public static class Node{
        int data;
        Node prev;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size = 0;

        void addLast(int data){
            Node newNode = new Node();
            newNode.data = data;
            
            if(size != 0){
                tail.next = newNode;
                newNode.prev = tail;
                newNode.next = null;
                tail = newNode;
                size++;
            }else{
                head = tail = newNode;
                newNode.prev = null;
                newNode.next = null;
                size++;
            }
        }

        void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args){
        LinkedList LL = new LinkedList();
        LL.addLast(20);
        LL.addLast(40);
        LL.print();
    }
}
