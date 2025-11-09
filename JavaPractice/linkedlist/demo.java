package linkedlist;

public class demo {
    Node head;
    Node tail;
    private int size=0;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

        void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print("null");
        }

        void addLast(int data) {
            Node newNode = new Node(data);

            if (size == 0) {
                newNode.next = null;
                newNode.prev = null;
                head = newNode;
                tail = newNode;
                size++;
            } else {
               newNode.next = null;
               tail.next = newNode;
               newNode.prev = tail;
               tail = newNode;
               size++;
            }

        }


    public static void main(String[] args) {
        demo l1 = new demo();
        l1.addLast(55);
        l1.addLast(45);
        l1.print();
    }
}
