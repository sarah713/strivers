import java.util.ArrayList;
import java.util.List;

public class BalancedParentheses {
    public static List<String> balancedParantheses(int n) {
        List<String> res = new ArrayList<>();
        helper(n, 0, 0, "", res);
        return res;
    }

    public static void helper(int n, int open, int close, String cur, List<String> res) {
        if (cur.length() == 2 * n) {
            res.add(new String(cur));
            return;
        }

        if (open < n) {
            helper(n, open + 1, close, cur + "(", res);
        }
        if (close < open) {
            helper(n, open, close + 1, cur + ")", res);
        }
    }
}
