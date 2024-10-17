package newpractice;

import java.util.ArrayList;
import java.util.List;

public class BalancedParantheses {
    public static List<String> balancedParantheses(int n) {
        List<String> res = new ArrayList<>();
        helper(n, 0, 0, "", res);
        return res;
    }

    public static void helper(int n, int open, int close, String s, List<String> res) {
        if (s.length() == 2 * n) {
            res.add(new String(s));
            return;
        }
        if (open < n) {
            helper(n, open + 1, close, s + "(", res);
        }
        if (close < n) {
            helper(n, open, close + 1, s + ")", res);
        }
    }
}
