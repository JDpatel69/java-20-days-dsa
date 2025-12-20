# Day 6 – Sliding Window (Variable Size)

Problem:
LeetCode 3 – Longest Substring Without Repeating Characters

Idea:
Maintain a window that always contains unique characters.
Expand the window by moving the right pointer.
If a duplicate appears, shrink the window from the left until it becomes valid again.

Approach:
- Use a HashSet to store characters in the current window
- Use two pointers (left and right) to define the window
- Move the right pointer to expand the window
- When a duplicate is found, remove characters from the left
- Track the maximum window size during the process

Key Learning:
- Variable-size sliding window does not restart the window
- Window is adjusted using left and right pointers
- Each character is added and removed at most once

Time Complexity: O(n)
Space Complexity: O(n)
