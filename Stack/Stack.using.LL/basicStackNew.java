public class basicStackNew {
    Node top;
    int size = 0;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = top;
        }
    }

    public void push(int data) {
        if (size >= 5) {
            System.out.println("stack overflow.");
        } else {
            Node newElem = new Node(data);
            top = newElem;
            size++;
        }
    }

    public void pop() {
        if (size == 0) {
            System.out.println("Stack underflow.");
        } else {
            top = top.next;
            size--;
        }
    }

    public void peek() {
        System.out.println(top.data);
    }

    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        basicStackNew ST = new basicStackNew();
        ST.push(25);
        ST.push(50);
        ST.push(64);
        ST.push(98);
        ST.pop();

        // ST.print();
        ST.peek();
    }
}