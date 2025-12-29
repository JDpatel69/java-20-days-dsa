# Day 16 – Daily Temperatures (Monotonic Stack)

Problem:
LeetCode 739 – Daily Temperatures

Approach:
- Use a monotonic decreasing stack
- Stack stores indices of days waiting for a warmer temperature
- Traverse temperatures from left to right
- While current temperature is warmer than stack top:
  - Pop index and calculate waiting days
- Push current index to stack

Key Learnings:
- Stack stores indices, not values
- Each index is pushed and popped at most once
- Efficient O(n) solution

Time Complexity: O(n)
Space Complexity: O(n)
