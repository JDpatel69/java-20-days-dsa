# Day 10 – Stack (Min Stack)

Problem:
LeetCode 155 – Min Stack

Approach:
- Use two stacks:
  - One for values
  - One for tracking minimums
- Push value to minStack only when it is <= current minimum
- Pop from minStack only when the popped value equals the current minimum

Key Learning:
- Stack can maintain historical state
- Auxiliary stack helps achieve O(1) getMin()

Time Complexity: O(1) for all operations
Space Complexity: O(n)
