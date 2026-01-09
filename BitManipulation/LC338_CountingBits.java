// LC 338 - Counting Bits
// Approach: DP + Bit Manipulation (Power of Two pattern)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] countBits(int n) {
        int [] bits = new int[n+1];
        bits[0]=0;
        int last2 = 1;
        for(int i=1;i<=n;i++) {
           if((i/last2)%2==0)last2=i;
            bits[i]=1+bits[i-last2];
        }
        return bits;
        
    }
}