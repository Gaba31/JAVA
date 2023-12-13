package LinkedList;

public class Middle_of_LL {
    // Brute force approach
//    public static Node MiddleLL(Node head){
//        int size = 0 ;
//        Node temp = head ;
//
//        while(temp!=null){
//            temp = temp.next;
//            size++;
//        }
//        size = size / 2;
//        temp = head;
//
//        for(int i = 0 ; i < size - 1 ; i++){
//                temp = temp.next;
//        }
//        return temp;
//    }

    // In one traversal approach
    public static Node MiddleLL(Node head){
        Node temp = head;
        Node slow = head;
        Node fast = head;

        while(fast.next.next!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node ans = MiddleLL(a);
//        display(ans);
        System.out.println(ans.data);
    }

}
