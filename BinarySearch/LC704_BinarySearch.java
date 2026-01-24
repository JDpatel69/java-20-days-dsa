// LC 704 - Binary Search
// Pattern: Binary Search
// Idea: Repeatedly shrink search space by comparing mid element
// Time Complexity: O(log n)
// Space Complexity: O(1)
class Solution {
    public int search(int[] nums, int target) {
        int right=nums.length-1;
        int left=0;
        while(right>=left){
        int mid = left + (right - left) / 2;
        if(nums[mid]==target)
        return mid;
        else
        {
            if(nums[mid]>target)
            right=mid-1;
            else
            left = mid+1;
        }
        }
    return -1;    
    }
}