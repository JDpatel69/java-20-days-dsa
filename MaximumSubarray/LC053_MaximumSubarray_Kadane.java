// LC 53 - Maximum Subarray (Kadane's Algorithm)
// Time: O(n)
// Space: O(1)


class Solution {
    public int maxSubArray(int[] nums) {
        int prevsum=0;
        int max=0;
        int negsum=-10000;
        for(int i=0;i<nums.length;i++){
             prevsum=prevsum+nums[i];
            if(prevsum<=0){
                 
                if(prevsum>negsum)
                {
                    negsum=prevsum;
                    }
                    prevsum=0;
            }
            if(prevsum>max){
                max=prevsum;
            }
        }
        if(negsum<max && max==0 )
        return negsum;
       
      return max;   
    }
}



