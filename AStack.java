import java.util.LinkedList;
import java.util.Queue;

public class AStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;

    public AStack() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();

    }

    public void push(int x) {
        q2.add(x);
        top = x;
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> tmp = q1;
        q1 = q2;
        q2 = tmp;
    }

    public int top() {
        return top;
    }

    public int pop() {
        int x = q1.remove();
        if (!q1.isEmpty()) {
            top = q1.peek();
        }
        return x;
    }
}
