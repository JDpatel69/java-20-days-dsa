// LC 287 - Find the Duplicate Number (Frequency Array Approach)
// Time: O(n)
// Space: O(n)

class LC287_FindDuplicateNumber_FreqArray {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length]; 
        int duplicate = 0;                 

        for (int num : nums) {             
            freq[num]++;
            if (freq[num] > 1) {
                duplicate = num;
                break;                    
            }
        }
        
        return duplicate;
    }
}