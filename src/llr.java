import com.sun.security.jgss.GSSUtil;

class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

class Linkedlist{
    Node head;
    Node tail;
    int size =  0;
    void AddTail(int val) {
        Node t = new Node(val);
        if (head == null) {
            head = t;
            tail = t;
        } else {
            tail.next = t;
            tail = t;
        }
        size++;
    }
    void AddHead(int val){
        Node t = new Node(val);
        if (head == null) {
            head = t;
            tail = t;
        } else {
            t.next = head;
            head = t;
        }
        size++;
    }
    void AddAtidx(int idx,int val){
        Node temp = head;
        int i=0;
        while (i!=idx){
            temp = temp.next;
            i++;
        }
       Node t = new Node(val);
       t.next = temp.next;
       temp.next=t;
       size++;
    }
    void DelAtidx(int idx){
        Node temp = head;
        int i=0;
        while (i!=idx){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }
    int getidx(int idx){
        Node temp = head;
        int i=0;
        while (i!=idx){
            temp = temp.next;
            i++;
        }
        return temp.val;
    }
    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void DeleteHead(){
        if (head==null){
            System.out.println("List is empty!");
        }
        else {
            head = head.next;
            size --;
        }
    }
    int search(int val){
        int idx=0;
        Node temp = head;
        while(temp!=null){
            if (temp.val == val){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

}
public class llr {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.AddHead(50);
        ll.AddTail(20);
        ll.AddTail(30);
        ll.AddTail(40);
        ll.AddHead(50);
        ll.AddAtidx(2,22);
        ll.DelAtidx(3);
        ll.DeleteHead();
        ll.display();
        System.out.println("Size: "+ ll.size);
        System.out.println(ll.search(30));
        System.out.println(ll.getidx(3));

    }
}
