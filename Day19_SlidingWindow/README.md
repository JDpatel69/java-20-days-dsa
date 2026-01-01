Day 19 – Longest Repeating Character Replacement

Problem:
LeetCode 424

Approach:
- Sliding window with frequency array
- Track maximum frequency in current window
- Window is valid if (window size - max frequency) <= k
- Shrink window when replacements exceed k
- Track maximum valid window size

Time Complexity: O(n)
Space Complexity: O(1)
