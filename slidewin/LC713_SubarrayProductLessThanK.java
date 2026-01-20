// LC 713 - Subarray Product Less Than K
// Pattern: Sliding Window (Product)
// Key idea: count subarrays ending at right -> right - left + 1
// Time: O(n), Space: O(1)
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro=1;
        int count=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            
            pro=pro*nums[i];
            while(pro>=k && i>=l){
                pro=pro/nums[l];
                l++;
            }
            
            count=count+(i-l+1);

        }
        return count;
        
    }
}