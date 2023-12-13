package LinkedList;

public class Intersection_of2_linkedList {

    public static Node Intersection_2_LL(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        int size1 = 0;
        int size2 = 0;

        while(temp1!=null){
            size1++;
            temp1 = temp1.next;
        }

        while (temp2!=null){
            size2++;
            temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;

        if(size1 > size2) {
            for(int i = 1 ; i<=size1-size2 ; i++){
                temp1 = temp1.next;
            }
        }
        else {
            for(int i = 1 ; i<=size2-size1 ; i++){
                temp2 = temp2.next;
            }
        }

        while(temp1!=temp2)
        {
           temp1 = temp1.next;
           temp2 = temp2.next;
        }
        return temp1;
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(87);
        Node b = new Node(100);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(12);
        Node g = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node a1 = new Node(90);
        Node a2 = new Node(9);

        a1.next = a2;
        a2.next = e;

        Node ans = Intersection_2_LL(a,a1);
        System.out.println(ans.data);


    }
}
