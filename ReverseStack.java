package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.size() == 1)
            return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);

    }

    public static void main(String ty[]) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        // pushAtBottom(st, 5);
        reverse(st);
        System.out.println(st);

    }
}
