public class refreshNew {
        node head = null;
        node tail = null;
        int size=0;

        class node{
            int data;
            node next;
            //constructor
            node(int data) {
                this.data = data;
                this.next = null;
            }
        }

    public void insert_rear(int data){
            node nn = new node(data);
            if(size!=0){ tail.next = nn; tail = nn;}
            else head=tail=nn;
            size++;
    }

    void display(){
            node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " -> ");
                temp=temp.next;
            }
        System.out.print("null");
    }

    public static void main(String[] args) {
        refreshNew ll = new refreshNew();
        ll.insert_rear(988);
        ll.insert_rear(456);
        //ll.display();
        System.out.println(ll.head.data);
    }
}
