import java.util.HashMap;

public class loop {
    
}
class node{
    int n;
    node next;
    node previous;

    public node() {}
    public node(int n){
        this.n= n;
        this.next = null;
    }
    public node head = null;

    public void insert(int n) {
        node newnode = new node(n);
        if (head == null) {
            head = newnode;
        } else {
            node current = head;
            while (current.next != null)
                current = current.next;
            current.next = newnode;
        }
    }
    public void display(){
        node current = head;
        while(current!= null){
            System.out.println(current.n);
            current=current.next;
        }
    }
    public void detectloop(){
        HashMap <node,Integer> hashMap = new HashMap<>();
        node current = head;
        while(current.next!=null){
            if (hashMap.containsKey(current.n)) {
                System.out.println(true);
            }
            hashMap.put(current, current.n );
            current=current.next;
        }

    }
    public void startingloop(){
        node current= head;
        HashMap <node,Integer> hashMap = new HashMap<>();
        int len = 0;
        while(current.next!=null){
            if (hashMap.containsKey(current.n)) {
                System.out.println("Starting of the loop is "+ current.n);
                System.out.println(len);
            }
            hashMap.put(current, current.n );
            current=current.next;
            len++;
        }

    }

}