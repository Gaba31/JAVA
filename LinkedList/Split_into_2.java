package LinkedList;

public class Split_into_2 {
    public static void Split(Node head){
        Node temp = head;
        Node oddHead = new Node(100);
        Node odd = oddHead;
        Node evenHead = new Node(100);
        Node even = evenHead;

        while(temp!=null) {
            if (temp.data % 2 == 1) {
                Node a = new Node(temp.data);
                odd.next = a;
                odd = a;

            } else {
                Node a = new Node(temp.data);
                even.next = a;
                even = a;
            }
            temp = temp.next;
        }

      Node OddTemp = oddHead.next;
        System.out.println("Odd Numbers");
        while (OddTemp!=null){
            System.out.println(OddTemp.data);
            OddTemp = OddTemp.next;
        }
        Node EvenTemp = evenHead.next;
        System.out.println("Even Numbers");
        while (EvenTemp!=null){
            System.out.println(EvenTemp.data);
            EvenTemp = EvenTemp.next;
        }
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(8);
        Node g = new Node(10);
        Node h = new Node(12);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        Split(a);
    }
}
