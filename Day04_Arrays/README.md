# Day 4 – Prefix / Running Sum Pattern

Problem:
LeetCode 1480 – Running Sum of 1D Array

Idea:
Running sum means each index stores the sum of all elements up to that point.
Instead of recalculating sums repeatedly, we carry forward the previous result.

Approach:
- Create a result array to store running sums
- Initialize the first element with the first value of input
- For each next index, add the current value to the previous running sum

Key Learning:
- Difference between input data and accumulated state
- Prefix / carry-forward pattern
- Importance of using previous result instead of raw input

Time Complexity: O(n)
Space Complexity: O(n)
