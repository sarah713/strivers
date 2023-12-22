package Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int cnt = 0, ele = 0;
        for (int i : nums) {
            if (cnt == 0) {
                cnt = 1;
                ele = i;
            } else if (ele == i) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return ele;
    }
}
