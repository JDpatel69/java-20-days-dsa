// O(n) time
// O(1) extra space



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left=1;
        int right=1;

        int [] result = new int[nums.length];
        result[0]=1;
        result[nums.length-1]=1;
        for(int i=1;i<nums.length;i++)
        {
            left*=nums[i-1];
            result[i]=left;
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            right*=nums[i+1];
            result[i]*=right;
        }
        return result;
    }
}