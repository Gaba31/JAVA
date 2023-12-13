import org.w3c.dom.Node;

public class Palindrome_LL {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

    public static boolean Palindrome(Node head){
        Node temp = head;
        Node duplicate = new Node(temp.data);
        Node dup = duplicate;

        while(temp.next!=null){
            Node a = new Node(temp.data);
            dup.next = a;
            dup = dup.next;
            temp = temp.next;
        }
        // Reverse a linked list
        Node check = duplicate;
        Node prev = null;
        Node curr = check;
        Node agla = null;

        while(curr!=null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }

        // Comparing
        temp = head;

        while(temp!=null){
            if(check.data != temp.data) return false;
            check = check.next;
            temp = temp.next;
        }
        return true;
    }

    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

      boolean ans = Node.Palindrome(a);
        System.out.println(ans);
//        Palindrome(a);
        
    }
}

