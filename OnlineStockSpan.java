import java.util.Stack;

public class OnlineStockSpan {
    Stack<int[]> prices;
    int span = 0;

    public OnlineStockSpan() {
        prices = new Stack<>();
    }

    public int next(int price) {
        span = 1;
        while (!prices.isEmpty() && prices.peek()[0] <= price) {
            span += prices.peek()[1];
            prices.pop();
        }
        prices.push(new int[] { price, span });
        return span;
    }
}
