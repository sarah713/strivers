package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandidateSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, res, new ArrayList<>());
        return res;
    }

    public void helper(int[] candidates, int target, int idx, List<List<Integer>> res, List<Integer> cur) {
        if (idx == candidates.length) {
            if (target == 0) {
                res.add(new ArrayList<>(cur));
            }
            return;
        }

        // include
        if (candidates[idx] <= target) {
            cur.add(candidates[idx]);
            helper(candidates, target - candidates[idx], idx + 1, res, cur);
            cur.remove(cur.size() - 1);
        }
        while (idx < candidates.length - 1 && candidates[idx] == candidates[idx + 1]) {
            idx++;
        }
        helper(candidates, target, idx + 1, res, cur);

    }
}
