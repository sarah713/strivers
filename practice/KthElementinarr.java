package practice;

public class KthElementinarr {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int i = 0, j = 0, s = 0;
        int[] res = new int[m + n];
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                res[s++] = arr1[i++];
            } else {
                res[s++] = arr2[j++];
            }
        }
        while (i < n) {
            res[s++] = arr1[i++];
        }
        while (j < m) {
            res[s++] = arr2[j++];
        }
        return res[k - 1];
    }
}
