class LPS {
    public String longestPalindrome(String s) {
        if (s.length() == 0 || s == null) {
            return s;
        }

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expandFromCenter(s, i, i + 1);
            String even = expandFromCenter(s, i, i);

            if (odd.length() > longest.length()) {
                longest = odd;
            } else {
                longest = even;
            }
        }
        return longest;
    }

    public String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}