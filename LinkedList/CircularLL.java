public class CircularLL {
    public static class Node{
        int data;
        Node prev;
        Node next;
    }
    public static class LinkedList {
        int size = 0;
        Node head;
        Node tail;

        void addLast(int data){
            Node newNode = new Node();
            newNode.data = data;
            if(size == 0){
                newNode.next = newNode;
                newNode.prev = newNode;
                head = tail = newNode;
                size++;
            }else{
                tail.next = newNode;
                newNode.next = head;
                newNode.prev = tail;
                tail = newNode;
                size++;
            }
        }

        void print(){
            Node temp = head;
            do{
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }while(temp != head);

            System.out.println("continues");
        }
    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.addLast(25);
        LL.addLast(54);
        LL.addLast(67);

        LL.print();
    }
}