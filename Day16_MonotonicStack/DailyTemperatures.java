import java.util.Stack;

public class DailyTemperatures {

    static class Solution {
        public int[] dailyTemperatures(int[] temperatures) {

            int[] ans = new int[temperatures.length];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < temperatures.length; i++) {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int idx = stack.pop();
                    ans[idx] = i - idx;
                }
                stack.push(i);
            }

            return ans;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = sol.dailyTemperatures(temperatures);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
