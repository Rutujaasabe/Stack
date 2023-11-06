package Stack;

public class StackArrayOp {
    public static class Stack {
        int arr[] = new int[50];
        int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("statck is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i < idx - 1; i++) {
                System.out.println(arr[1] + " ");

            }
            System.out.println();
        }

        boolean isFull() {
            if (idx == arr.length)
                return true;

            else
                return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        st.pop();
        st.display();

    }
}
