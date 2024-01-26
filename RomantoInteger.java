import java.util.HashMap;
import java.util.Map;

class RomantoInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] val = { 1, 5, 10, 50, 100, 500, 1000 };
        char[] symbol = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        for (int i = 0; i < 7; i++) {
            map.put(symbol[i], val[i]);
        }
        int total = 0;
        int prev = 0;
        for (int i = 0; i < 7; i++) {
            int curr = map.get(s.charAt(i));
            if (curr > prev) {
                total = total - prev;

            } else {
                total += prev;
            }
            prev = curr;
        }
        total += prev;
        return total;
    }
}