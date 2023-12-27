public class ValidPalind {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        String res = sb.toString().toLowerCase();
        int i = 0, j = res.length() - 1;
        while (i < j) {
            if (res.charAt(i) != res.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
