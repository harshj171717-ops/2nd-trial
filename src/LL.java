public class LL {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static int get(Node head,int idx){
        for (int i=0 ; i<idx ; i++){
            head=head.next;
        }
        return head.val;
    }
    public static void display(Node head){
        if(head==null){return;}
            System.out.println(head.val + " ");
            display(head.next);
    }
    public static void main(String[] args) {
        Node a =new Node(10);
        Node b1 =new Node(10);
        Node c =new Node(30);
        Node b2 =new Node(40);
        Node d =new Node(50);
        a.next=b1;
        b1.next=c;
        c=b2.next;
        b2=d.next;
        display(a);
        System.out.println(get(a,3));
    }
}
