package practice;

import java.util.ArrayList;

public class PermutationSeq {
    public String getPermutation(int n, int k) {
        int fact = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            list.add(i);
        }
        list.add(n);

        String ans = "";
        k = k - 1;
        while (true) {
            ans = ans + "" + list.get(k / fact);
            list.remove(k / fact);
            if (list.size() == 0) {
                break;
            }
            k = k % fact;
            fact = fact / list.size();
        }
        return ans;
    }
}
