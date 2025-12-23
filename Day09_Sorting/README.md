# Day 9 – Sorting + Logic (Merge Intervals)

Problem:
LeetCode 56 – Merge Intervals

Approach:
- Sort intervals by start time
- Traverse intervals and merge overlapping ones
- Two intervals overlap if next.start <= current.end
- Merge by extending the end to max(current.end, next.end)

Key Learning:
- Sorting simplifies interval problems
- Overlapping intervals become adjacent after sorting
- Single pass merge after sorting

Time Complexity: O(n log n)
Space Complexity: O(n)
