public class RepeatandMissing {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        long missing = 0;
        long repeating = 0;
        long n = a.length;
        long sumOfN = (n * (n - 1)) / 2;
        long sumOfsquares = (n * (n + 1) * (2 * n + 1)) / 6;

        for (int i = 0; i < a.length; i++) {
            sumOfN -= (long) a[i];
            sumOfsquares -= (long) a[i] * (long) a[i];
        }

        missing = (sumOfN + sumOfsquares / sumOfN) / 2;
        repeating = missing - sumOfN;
        return new int[] { (int) missing, (int) repeating };
    }
}
