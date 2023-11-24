import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if (map.containsKey(sorted)) {
                map.get(sorted).add(s);
            } else {
                List<String> cur = new ArrayList<>();
                cur.add(s);
                map.put(sorted, cur);
            }
        }
        for (List<String> l : map.values()) {
            res.add(l);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> res = groupAnagrams(s);
        for (List<String> l : res) {
            System.out.println(l);
        }
    }
}
