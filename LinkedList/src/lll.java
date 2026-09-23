public class lll {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class ll {
        Node head = null;
        Node tail = null;
        void addt(int val){
            Node temp = new Node(val); // Use the passed parameter

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
    }
    public static void display(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.val + " "); // Changed to print so they stay on one line
        display(head.next);
    }
    public static void get(Node head,int n) {
        Node temp =head;
        for (int i=0 ; i<n ; i++){

        }
    }

    public static void main(String[] args) {
        ll list = new ll();
        list.addt(10);
        list.addt(20);
        list.addt(30);
        get(ll.head,3);
        display(list.head);
    }
}