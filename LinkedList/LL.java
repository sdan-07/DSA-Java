public class LL {

    Node head;
    Node tail;
    int size = 0;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (size == 0) {
            head = tail = newNode;
            size++;
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void addFront(int data) {
        Node newNode = new Node(data);

        if (size == 0) {
            head = tail = newNode;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void print() {
        Node temp;
        temp = head;
        // traverse
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (size == 1) {
            head = tail = null;
            size = 0;
        } else if (size == 0) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            size--;
        }
    }

    public void addAt(int idx, int data) {
        if (idx > size || idx < 0) {
            System.out.println("Invalid arguments.");
        } else if (idx == 0) {
            addFront(data);
        } else if (idx == size) {
            addLast(data);
        } else {
            Node newNode = new Node(data);

            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public void removeLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }

    public void removeAt(int idx) {
        if (size == 0 || idx > size) {
            System.out.println("Invalid argument");
        } else if (idx == 0) {
            Node temp = head;
            head = head.next;
            temp.next = null;
        } else if (idx == size - 1) {
            removeLast();
        } else {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node oldHead = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        tail = oldHead;

        // printing the linked list
        Node trave = head;
        while (trave != null) {
            System.out.print(trave.data + " -> ");
            trave = trave.next;
        }
        System.out.println("null");
    }

    public LL mergeTwoSortedLists(LL L1, LL L2) {
        Node one = L1.head;
        Node two = L2.head;
        LL resList = new LL();

        while (one != null && two != null) {
            if (one.data < two.data) {
                resList.addLast(one.data);
                one = one.next;
            } else {
                resList.addLast(two.data);
                two = two.next;
            }
        }
        while (one != null) {
            resList.addLast(one.data);
            one = one.next;
        }
        while (two != null) {
            resList.addLast(two.data);
            two = two.next;
        }
        return resList;
    }

    public LL mergeSort(Node head, Node tail) {
        if (head == tail) {
            LL resList = new LL();
            resList.addLast(head.data);
            return resList;
        }
        // Find the middle node
        Node slow = head;
        Node fast = head;
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        LL leftHalf = mergeSort(head, mid);
        LL rightHalf = mergeSort(mid.next, tail);

       return mergeTwoSortedLists(leftHalf, rightHalf);
    }

    public static void main(String[] args) {
        LL L1 = new LL();
        LL newList;

        L1.addLast(150);
        L1.addLast(10);
        L1.addLast(90);
        L1.addFront(65);
        L1.addAt(2, 56);
        //L1.print();

        newList = L1.mergeSort(L1.head, L1.tail);
        newList.print();

    }
}