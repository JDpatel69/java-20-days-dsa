# Day 5 – Sliding Window (Fixed Size)

Problem:
LeetCode 643 – Maximum Average Subarray I

Approach:
- Compute the sum of the first k elements
- Store it as the initial maximum
- Slide the window one step at a time
- Remove the element leaving the window and add the new element
- Update the maximum sum if needed

Key Learning:
- Sliding window is index-based, not value-based
- Each step updates the sum in constant time
- Avoids recalculating sums for every subarray

Time Complexity: O(n)
Space Complexity: O(1)
