import java.util.*;

public class GroupAnagrams {

    private static String gets(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            HashMap<String, List<String>> hs = new HashMap<>();

            for (String item : strs) {
                String key = gets(item);

                if (!hs.containsKey(key)) {
                    hs.put(key, new ArrayList<>());
                }

                hs.get(key).add(item);
            }

            List<List<String>> result = new ArrayList<>();

            for (List<String> group : hs.values()) {
                result.add(group);
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = sol.groupAnagrams(strs);

        System.out.println(result);
    }
}
