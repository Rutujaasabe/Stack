package Stack;

import java.util.Stack;

public class BasicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st);
        // st.pop();
        // System.out.println(st);
        // st.peek();
        // System.out.println(st);

        // reverse stack
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {

            // rt.push(st.pop());

        }
        System.out.println(rt);

        // reverse stack with same oreder
        Stack<Integer> gt = new Stack<>();
        while (rt.size() > 0) {
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
