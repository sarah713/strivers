public class CountandSay {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";

        StringBuilder cur = new StringBuilder();
        String prev = countAndSay(n - 1);

        int cnt = 0;
        for (int i = 0; i < prev.length(); i++) {
            cnt++;
            if (i == prev.length() - 1 || prev.charAt(i) != prev.charAt(i + 1)) {
                cur.append(cnt).append(prev.charAt(i));
                cnt = 0;
            }
        }
        return cur.toString();
    }
}
