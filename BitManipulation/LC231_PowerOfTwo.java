// LC 231 - Power of Two
// Approach: Bit Manipulation
// Key Idea: n > 0 && (n & (n - 1)) == 0
// Time Complexity: O(1)
// Space Complexity: O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        if((n & (n-1)) == 0 && n>0)  return true ;
         return false ;       
    }
}