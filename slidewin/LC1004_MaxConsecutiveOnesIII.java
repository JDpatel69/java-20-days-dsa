// LC 1004 - Max Consecutive Ones III
// Pattern: Sliding Window
// Idea: Maintain a window with at most k zeros, shrink when exceeded
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int c1=0;
        int c2=0;
        int max=0;
         for(int i=0;i<nums.length;i++){
                if(nums[i]==1)
                c2++;
                else{
                    c1++;c2++;
                }
                while(c1>k && i>=l){
                  if(nums[l]==0)c1--;
                  l++;
                  c2--;
                }
                
                max=Math.max(max,c2);
         }
         return max;
        
    }
}