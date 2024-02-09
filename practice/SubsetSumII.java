package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSumII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, 0, res, new ArrayList<>());
        return res;
    }

    public void helper(int[] nums, int idx, List<List<Integer>> res, List<Integer> cur) {
        res.add(new ArrayList<>(cur));

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }
            cur.add(nums[i]);
            helper(nums, i + 1, res, cur);
            cur.remove(cur.size() - 1);
        }
    }
}
