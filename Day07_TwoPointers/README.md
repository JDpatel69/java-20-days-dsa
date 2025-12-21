# Day 7 – Two Pointers (Container With Most Water)

Problem:
LeetCode 11 – Container With Most Water

Idea:
Use two pointers starting from both ends of the array.
The area is limited by the smaller height, not the larger one.

Approach:
- Initialize left at start and right at end
- Compute area using width * min(height[left], height[right])
- Move the pointer pointing to the smaller height
- Track the maximum area during traversal

Key Learning:
- Greedy two-pointer movement is safe
- Smaller height limits the area
- Each pointer moves only inward, ensuring O(n) time

Time Complexity: O(n)
Space Complexity: O(1)
