package practice;

public class NthRootofM {
    long multiply(long mid, int n, int m) {
        // Your code here
        long answer = 1;
        for (int i = 1; i <= n; i++) {
            answer = answer * mid;
            if (answer > m)
                break;
        }
        return answer;

    }

    public int NthRoot(int n, int m) {
        // code here
        if (m == 0 || m == 1)
            return m;

        long low = 1, high = m;

        while (low <= high) {
            long mid = (low + high) / 2;
            long ans = multiply(mid, n, m);
            if (m == ans)
                return (int) mid;
            if (ans > m)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
