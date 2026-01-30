// LC 682 - Baseball Game
// Pattern: Stack
// Idea: Simulate operations using stack, track running sum
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;

        for (String op : operations) {

            if (op.equals("+")) {
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a + b);
                sum += a + b;
            }

            else if (op.equals("D")) {
                int val = st.peek() * 2;
                st.push(val);
                sum += val;
            }

            else if (op.equals("C")) {
                sum -= st.pop();
            }

            else { 
                int val = Integer.parseInt(op);
                st.push(val);
                sum += val;
            }
        }
        return sum;
    }
}
