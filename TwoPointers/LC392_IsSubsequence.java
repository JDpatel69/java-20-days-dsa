// LC 392 - Is Subsequence
// Approach: Two Pointers
// Idea: Traverse t, advance pointer in s on match
// Time Complexity: O(t.length())
// Space Complexity: O(1)
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int j=0;
        for(int i=0;i<t.length();i++){
             
                if(j < s.length() && s.charAt(j)==t.charAt(i)){
                    j++;

                }

        }
        if(j==s.length())
        return true;
        return false;
    }
}