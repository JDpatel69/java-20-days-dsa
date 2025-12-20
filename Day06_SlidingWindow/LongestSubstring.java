import java.util.HashSet;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            // If duplicate appears, shrink window from the left
            while (window.contains(s.charAt(right))) {
                window.remove(s.charAt(left));
                left++;
            }

            // Add current character to window
            window.add(s.charAt(right));

            // Update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
