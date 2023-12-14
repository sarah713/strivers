public class ReplaceRight {
    public int[] replaceElements(int[] arr) {
        int maxRight = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, curr);
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
