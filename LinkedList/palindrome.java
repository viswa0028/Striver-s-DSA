import java.util.Arrays;
import java.util.HashMap;

public class palindrome {
    public static void main(String[] args) {
        node2 check = new node2();
        check.insert(1);
        check.insert(2);
        check.insert(3);
        check.insert(2);
        check.insert(1);
        check.palindrome();
    }
}
class node2 {
    int n;
    node2 next;
    node2 previous;

    public node2() {
    }

    public node2(int n) {
        this.n = n;
        this.next = null;
    }

    public node2 head = null;

    public void insert(int n) {
        node2 newnode2 = new node2(n);
        if (head == null) {
            head = newnode2;
        } else {
            node2 current = head;
            while (current.next != null)
                current = current.next;
            current.next = newnode2;
        }
    }

    public void display() {
        node2 current = head;
        while (current != null) {
            System.out.println(current.n);
            current = current.next;
        }
    }

    public void palindrome() {
        int len = 0;
        node2 current = head;

        // Correct length calculation
        while (current != null) {
            current = current.next;
            len++;
        }

        // Create arrays with correct length
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];

        // Fill arr1 with original order
        current = head;
        for (int i = 0; i < len; i++) {
            arr1[i] = current.n;
            current = current.next;
        }

        // Fill arr2 with reverse order
        current = head;
        for (int i = len - 1; i >= 0; i--) {
            arr2[i] = current.n;
            current = current.next;
        }

        // Check if both arrays are equal
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }


}