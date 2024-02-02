import java.util.ArrayList;
import java.util.List;

public class SubsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, 0, res, new ArrayList<>());
        return res;
    }

    public void helper(int[] nums, int idx, List<List<Integer>> res, List<Integer> cur) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(cur));
        }
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[idx]) {
                continue;
            }
            cur.add(nums[i]);
            helper(nums, idx + 1, res, cur);
            cur.remove(cur.size() - 1);

        }
    }
}
