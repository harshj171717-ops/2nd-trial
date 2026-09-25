import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);
        int ele = 0;
        addStack(ele,st);
        System.out.println(st);
        reverce(st);
        System.out.println(st);
    }

    private static void reverce(Stack<Integer> st) {
        if (st.size()==1) return;
        int a = st.pop();
        reverce(st);
        addStack(a,st);
    }

    private static void addStack(int ele, Stack<Integer> st) {
        if (st.size()==0) {st.push(ele); return;}
        int a = st.pop();
        addStack(ele , st);
        st.push(a);
    }

}
