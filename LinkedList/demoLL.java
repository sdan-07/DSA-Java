public class demoLL {
    Node head;
    Node tail;
    private int size=0;

    class Node {
        Node next;
        private int data;

        Node(int data){
        this.data = data;
        this.next = null;
        }
    }

        public void print() {
            Node ptr = head;
            while(ptr != null) {
                System.out.print(ptr.data+"->");
                ptr = ptr.next;
            }
        }

        public void addLast(int data) {
            //this.data = data;
            Node newNode = new Node(data);

            if (size==0) {
                newNode.next = null;
                head = newNode;
                tail = newNode;
                size++;
            } else {
                newNode.next = null;
                tail = newNode;
                size++;

            }
            print();
        }

        public static void main(String[] args) {
            LL list1 = new LL();
            list1.addLast(10);
            list1.addLast(50);
            list1.addLast(85);
            list1.addLast(88);
            list1.print();
        }

}
