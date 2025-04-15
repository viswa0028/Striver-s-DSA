
public class middle {
    public static void main(String[] args) {
        node1 Linkedlist = new node1();
        Linkedlist.insert(1);
        Linkedlist.insert(2);
        Linkedlist.insert(3);
        Linkedlist.insert(4);
        Linkedlist.insert(5);
        Linkedlist.insert(6);
        Linkedlist.insert(7);
        Linkedlist.display();
        Linkedlist.middle();
    }
}

class node1{
    int n;
    node1 next;
    node1 previous;

    public node1() {}
    public node1(int n){
        this.n= n;
        this.next = null;
    }
    public node1 head = null;

    public void insert(int n) {
        node1 newnode1 = new node1(n);
        if (head == null) {
            head = newnode1;
        } else {
            node1 current = head;
            while (current.next != null)
                current = current.next;
            current.next = newnode1;
        }
    }
    public void display(){
        node1 current = head;
        while(current!= null){
            System.out.println(current.n);
            current=current.next;
        }
    }
    public void middle()
    {
        int len = 0;

        node1 current = head;
        if (current == null) {
            System.out.println(true);
        }
        while (current != null) {
            len++;
            current = current.next;
        }
        int i=0;
        node1 current1 = head;
        while(i< len/2){
            current1 = current1.next;
            i++;
        }
        System.out.println(current1.n);

    }

}