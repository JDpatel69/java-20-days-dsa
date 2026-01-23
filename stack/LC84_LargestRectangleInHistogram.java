// LC 84 - Largest Rectangle in Histogram
// Pattern: Monotonic Increasing Stack
// Idea:
// - Maintain indices of increasing bar heights
// - When a smaller height appears, pop and calculate area
// - Width = currentIndex - previousSmallerIndex - 1
// - Add a sentinel (0 height) at the end to flush stack
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int largestRectangleArea(int[] heights) {
        int left = 0 ;
        int area=0;
        int n = heights.length;
      
        Stack<Integer> sa = new Stack<Integer>();
            
                 for(int i=0;i<=n;i++){
                int curr = ( i==n )? 0 : heights[i];    
        
                while(!sa.isEmpty() && curr < heights[sa.peek()]){
                int hg = heights[sa.pop()];
                left = sa.isEmpty() ? -1 : sa.peek();
                int wi = i - left - 1;
                area = Math.max(area,hg*wi);         
                }
                sa.push(i);
            }

       return area; 
    }
}