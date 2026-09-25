class node{
    int val;
    node next;
    node(int val){
        this.val = val;
        this.next = null;
    }
}
class MyStack{
    node head;
    int len=0;
    int peek(){
        return head.val;
    }
    void push(int val){
        node temp = new node(val);
        if (head==null){
            head=temp;
            len++;
        }
        else{
            temp.next = head;
            head = temp;
            len++;
        }
    }
    int pop(){
        int x = -1;
        if (head==null){
            System.out.println("Stack Underflow!");
        }
        else{
            x = head.val;
           head = head.next;
        }
        return x;
    }
    void print(){
        if (len==0) System.out.println("Stack Underflow!");
        node temp = head;
        while(temp!=null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
    }
}
public class Stackll {
    public static void main(String[] args) {
    MyStack st = new MyStack();
    st.pop();
    st.push(10);
    st.push(20);
        st.push(30);
        st.push(40);st.push(50);


    st.print();
    System.out.println(st.pop());
    st.print();
        System.out.println(st.peek());
    }
}
