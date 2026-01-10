// LC 190 - Reverse Bits
    // Approach: Bit extraction and left-shift accumulation
// Time: O(1) (32 iterations)
// Space: O(1)

class Solution {
    public int reverseBits(int n) {
        int lb=0;
        int rs=0;
        for(int i=0;i<32;i++)
        {
            lb=0;
            if(n%2!=0) lb=1;
            rs=(rs*2)+lb;
            n=n/2;

        }
        return rs;
    }
}