public class ConcatArrays {
    public static int[] concatenate(int[] arr) {
        int[] copy = new int[arr.length * 2];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = arr[i % arr.length];
        }

        return copy;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] res = concatenate(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }

    }
}
