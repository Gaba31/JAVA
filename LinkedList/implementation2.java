package LinkedList;

public class implementation2 {
    public static class linkedlist{
        Node head = null ;
        Node tail = null ;
        int size = 0;

        void insertAtEnd(int val){
            Node temp = new Node(val);

            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp ;
            }
            size++;
        }
        void insertAthead(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;

        }
        void insertAt(int idx , int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size)
            {
                insertAtEnd(val);
                return;
            }
            else if(idx == 0) {
                insertAthead(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("wrong index");
                return;
            }
            for(int i = 0 ; i < idx - 1 ; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getAt(int idx){

             if(idx<0 || idx>size){
//                System.out.println("wrong index");
                return -1;
            }
            Node temp = head ;
            for(int i = 0 ; i < idx ; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp = head ;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        void deleteAt(int idx){
            Node t = head;
            if(idx==0){
                head = head.next;
                size--;
                return;
            }
           else if(idx<0 || idx>size){
                System.out.println("wrong index");
                return;
//                return -1;
            }
            for(int i = 1 ; i<=idx-1 ; i++)
            {
                t = t.next;
            }
            t.next = t.next.next;
            size--;
            tail = t;
        }
    }

//        int size(){   //O(n)
//            Node temp = head ;
//            int count = 0;
//            while(temp!=null){
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }

//    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(12);
        ll.insertAtEnd(13);
//        ll.display();
//        ll.insertAt(0,10);
//        ll.display();
//        System.out.println(ll.getAt(7));
//        System.out.println(ll.size);
//        ll.display();
        ll.deleteAt(9);
        ll.display();


    }
}
