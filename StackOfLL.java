package Stack;

public class StackOfLL {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLStack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void display() {

        }

        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return head.val;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(3);
        st.push(2);
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(7);
        st.push(8);

    }
}
