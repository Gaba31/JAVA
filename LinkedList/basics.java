package LinkedList;

public class basics {
    public static void insertAtEnd(Node head,int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }
        t.next = temp;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void display_recur(Node head){
        if(head==null) return;
        System.out.println(head.data);
        display_recur(head.next);
    }
    public static class Node{
        int data; // value
        Node next; // value of next node

        Node(int data) // constructor
        {
            this.data = data;
        }
    }

  public static  int size(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(5);  // creating
//       System.out.println(x.next);
        Node b = new Node(3);  // creating
        Node c = new Node(9);  // creating
        Node d = new Node(8);  // creating
        Node e = new Node(16);  // creating

        // 5 -> 3 -> 9 -> 8 -> 16

        a.next = b;     // 5 -> 3  9  8  16
//      System.out.println(a.next.data);
        b.next = c;     // 5 -> 3 -> 9  8  16
        c.next = d;     // 5 -> 3 -> 9 -> 8  16
        d.next = e;     // 5 -> 3 -> 9 -> 8 -> 16

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

        display(a);
//        display_recur(a);  //recursively

//        System.out.println(size(a));
        insertAtEnd(a,87);
        display(a);
    }
}
