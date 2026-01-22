// LC 503 - Next Greater Element II
// Pattern: Monotonic Stack (Circular Array)
// Idea: Traverse array twice (2N), use stack to find next greater element
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> sa = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;

            while (!sa.isEmpty() && nums[sa.peek()] <= nums[index]) {
                sa.pop();
            }

            if (i < n) {
                ans[index] = sa.isEmpty() ? -1 : nums[sa.peek()];
            }

            sa.push(index);
        }
        return ans;
    }
}
