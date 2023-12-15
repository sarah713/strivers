public class LengthOfLast {
    public int lengthOfLastWord(String s) {
        int first = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                first = i;
                break;
            }
        }
        String tmp = s.substring(first).trim();

        return tmp.length();
    }
}
