import java.util.*;

public class FindAllAnagrams {

    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {

            List<Integer> result = new ArrayList<>();
            if (s.length() < p.length()) return result;

            int[] freqp = new int[26];
            int[] freqw = new int[26];

            for (int i = 0; i < p.length(); i++) {
                freqp[p.charAt(i) - 'a']++;
            }

            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                freqw[s.charAt(i) - 'a']++;

                if (i - j + 1 > p.length()) {
                    freqw[s.charAt(j) - 'a']--;
                    j++;
                }

                if (Arrays.equals(freqp, freqw)) {
                    result.add(j);
                }
            }
            return result;
        }
    }

   
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> ans = sol.findAnagrams(s, p);

        System.out.println(ans); 
    }
}
