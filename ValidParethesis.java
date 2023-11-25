import java.util.Stack;

public class ValidParethesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (st.peek() != '(' || st.isEmpty()) {
                    return false;
                }
                st.pop();
            } else if (c == '}') {
                if (st.peek() != '{' || st.isEmpty()) {
                    return false;
                }
                st.pop();
            } else if (c == ']') {
                if (st.peek() != '[' || st.isEmpty()) {
                    return false;
                }
                st.pop();
            } else {
                st.push(c);
            }

        }
        return st.isEmpty();
    }
}
