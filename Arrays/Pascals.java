package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Pascals {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = null, prev = null;
        for (int i = 0; i < numRows; ++i) {
            cur = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
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
