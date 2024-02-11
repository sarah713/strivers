package practice;

public class AllocateMinPages {
    public static int findPages(int[] A, int N, int M) {
        int ans = -1;
        int low = 0;
        for (int val : A) {
            low = Math.max(val, low);
        }
        int hi = 0;
        for (int val : A) {
            hi += val;
        }
        while (low <= hi) {
            int mid = low + (hi - low) / 2;
            if (isValid(A, mid, M)) {
                ans = mid;
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isValid(int[] A, int mid, int M) {
        int cnt = 1;
        int sum = 0;
        for (int val : A) {
            if (sum + val <= mid) {
                sum += val;
            } else {
                cnt++;
                sum = val;
            }
        }
        if (cnt <= M) {
            return true;
        }
        return false;
    }
}
