// LC 162 - Find Peak Element
// Pattern: Binary Search
// Idea: Compare mid with mid+1 to decide slope direction
// Time Complexity: O(log n)
// Space Complexity: O(1)
class Solution {
    public int findPeakElement(int[] nums) {
        int right=nums.length-1;
        int left =0;
       
         while(right>left){
            int mid = left + (right - left )/2;
              

            if(nums[mid]<nums[mid+1]){
                left= mid+1;
            }
            else
            right = mid;
         }
       return left; 
    }
}