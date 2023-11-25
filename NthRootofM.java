public class NthRootofM {
    public double nthroot(double n, double m) {
        double eps = 1e-7;
        double lo = 1, hi = m;
        while (hi - lo > eps) {
            double mid = (hi + lo) / 2.0;
            if (multiply(mid, n) > m) {
                hi = mid;
            } else {
                lo = mid;
            }
        }
        return lo;
    }

    public double multiply(double mid, double n) {
        double ans = 1.0;
        for (int i = 0; i <= (int) n; i++) {
            ans = ans * mid;
        }
        return ans;
    }
}
