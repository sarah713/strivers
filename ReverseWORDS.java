public class ReverseWORDS {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        int wordEnd = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                wordEnd = i;
            }
            if (s.charAt(i - 1) == ' ' || i == 0) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(s, i, wordEnd);
            }
        }
        return sb.toString();
    }
}
