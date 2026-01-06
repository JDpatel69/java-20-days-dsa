class LC152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int ans = nums[0];  
        int max = nums[0];  
        int min = nums[0];  
        
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            
            // Temp to avoid overwriting
            int temp_max = Math.max(num, Math.max(max * num, min * num));
            int temp_min = Math.min(num, Math.min(max * num, min * num));
            
            max = temp_max;
            min = temp_min;
            
            ans = Math.max(ans, max);
        }
        
        return ans;
    }
}