# Day 17 – Next Greater Element I (Monotonic Stack)

Problem:
LeetCode 496 – Next Greater Element I

Approach:
- Use a monotonic decreasing stack
- Traverse nums2 once
- Stack stores numbers waiting for a greater element
- When a larger number is found:
  - Pop smaller elements from stack
  - Map them to the current number
- Use HashMap to answer queries for nums1 in O(1)

Key Learnings:
- Reuse monotonic stack pattern
- Stack solves multiple elements at once
- HashMap avoids repeated searching

Time Complexity: O(n)
Space Complexity: O(n)
