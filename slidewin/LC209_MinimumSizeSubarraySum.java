// LC 209 - Minimum Size Subarray Sum
// Approach: Sliding Window
// Idea: Expand right pointer, shrink left while sum >= target
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int j=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            while(target<=sum)
            {
                ans=Math.min(ans,i-j+1);
                sum=sum-nums[j];
                j++;
            }
                

        }
      return ans == Integer.MAX_VALUE ? 0 : ans; 
    }
}