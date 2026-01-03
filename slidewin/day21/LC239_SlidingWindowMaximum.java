import java.util.*;

class LC239_SlidingWindowMaximum {

    /**
     * Returns the maximum value in each sliding window of size k.
     * Uses a monotonic deque (decreasing order of values) to track candidates.
     *
     * Time Complexity: O(n) - each element is added and removed at most once
     * Space Complexity: O(k) - deque stores at most k indices
     *
     * @param nums array of integers
     * @param k    size of the sliding window
     * @return array of maximums for each window
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Edge cases
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); 

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

                if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
                 deque.offerLast(i);
                
                  if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    
    public static void main(String[] args) {
        LC239_SlidingWindowMaximum sol = new LC239_SlidingWindowMaximum();

        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        System.out.println(Arrays.toString(sol.maxSlidingWindow(nums1, k1))); // [3,3,5,5,6,7]

        int[] nums2 = {1};
        int k2 = 1;
        System.out.println(Arrays.toString(sol.maxSlidingWindow(nums2, k2))); // [1]
    }
}