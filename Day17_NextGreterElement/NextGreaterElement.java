import java.util.*;

public class NextGreaterElement {

    static class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {

            Stack<Integer> stack = new Stack<>();
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int num : nums2) {
                while (!stack.isEmpty() && num > stack.peek()) {
                    map.put(stack.pop(), num);
                }
                stack.push(num);
            }

            int[] ans = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                ans[i] = map.getOrDefault(nums1[i], -1);
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = sol.nextGreaterElement(nums1, nums2);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
