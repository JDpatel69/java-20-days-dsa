// LC 153 - Find Minimum in Rotated Sorted Array
// Pattern: Binary Search
// Idea:
// - Compare mid with right
// - If mid > right → min lies on right side
// - Else → min lies at mid or left side
// Time Complexity: O(log n)
// Space Complexity: O(1)
class Solution {
    public int findMin(int[] nums) {
        int right=nums.length-1;
        int left =0 ;
        
         while(right>left){
                int mid = left + (right - left )/2;
                
                if(nums[mid]>nums[right]) {
                    left = mid+1;
                }else {
                    right = mid;
                }

         }
       return nums[left]; 
    }
}