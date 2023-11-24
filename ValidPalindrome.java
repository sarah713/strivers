public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        String curS = new String(sb.toString().toLowerCase());
        int i = 0, j = curS.length() - 1;
        while (i < j) {
            if (curS.charAt(i) != curS.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
