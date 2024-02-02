package practice;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(arr, 0, 0, res, N);
        Collections.sort(res);
        return res;
    }

    void helper(ArrayList<Integer> arr, int idx, int sum, ArrayList<Integer> res, int n) {
        if (idx == n) {
            res.add(sum);
            return;
        }
        helper(arr, idx + 1, arr.get(idx) + sum, res, n);
        helper(arr, idx + 1, sum, res, n);

    }
}
