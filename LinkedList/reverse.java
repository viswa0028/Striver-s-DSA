public class reverse {

    public static void main(String[] args) {
        Node Linkedlist = new Node();
        Linkedlist.insert(1);
        Linkedlist.insert(2);
        Linkedlist.insert(3);
        Linkedlist.insert(4);
        Linkedlist.insert(5);
        Linkedlist.insert(6);
        Linkedlist.reverseUsingArray();
        Linkedlist.display();
    }

}

class Node{
    int n;
    Node next;
    Node previous;

    public Node() {}
    public Node(int n){
        this.n= n;
        this.next = null;
    }
    public Node head = null;

    public void insert(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }
    public void display(){
        Node current = head;
        while(current!= null){
            System.out.println(current.n);
            current=current.next;
        }
    }
    public void reverseUsingArray() {
        int len = 0;
        Node current = head;
        while (current != null) {
            len++;
            current = current.next;
        }

        int[] arr = new int[len];
        current = head;
        for (int i = 0; i < len; i++) {
            arr[i] = current.n;
            current = current.next;
        }

        current = head;
        for (int i = len - 1; i >= 0; i--) {
            current.n = arr[i];
            current = current.next;
        }
    }

}