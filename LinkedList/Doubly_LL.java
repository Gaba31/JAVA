public class Doubly_LL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void displayrandom(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp = temp.prev;
        }
       while(temp!=null){
           System.out.print(temp.val+" ");
           temp = temp.next;
       }
        System.out.println();
    }
    public static Node insertAthead(Node head , int val){
        Node t = new Node(val);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAtTail(Node head , int x){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t  = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    public static void insertAtIdx(Node head ,int idx , int x){
        Node s = head;
        for(int i = 1 ; i<=idx-1 ;i++){
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

//        display(a);
//        displayrev(e);
//        displayrandom(c);
//        Node newHead = insertAthead(a,35);
//        displayrandom(newHead);

//        insertAtTail(a,90);
//        display(a);

        insertAtIdx(a,3,56);
        display(a);
    }
}
