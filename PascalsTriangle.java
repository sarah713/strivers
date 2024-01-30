import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        // brute force
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = null, prev = null;
        // cur.add(1);
        // res.add(cur);
        // for (int i = 1; i <= numRows; i++) {
        // List<Integer> prev = res.get(i - 1);
        // List<Integer> tmp = new ArrayList<>();
        // tmp.add(1);
        // for (int j = 1; j < i; j++) {
        // tmp.add(prev.get(j - 1) + prev.get(j));
        // }
        // tmp.add(1);
        // res.add(tmp);
        // }
        // return res;
        for (int i = 0; i < numRows; i++) {
            cur = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    cur.add(1);
                } else {
                    cur.add(prev.get(j - 1) + prev.get(j));
                }

            }
            prev = cur;
            res.add(cur);
        }
        return res;
    }
}
