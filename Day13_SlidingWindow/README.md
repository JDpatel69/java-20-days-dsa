# Day 13 – Sliding Window (Find All Anagrams in a String)

Problem:
LeetCode 438 – Find All Anagrams in a String

Approach:
- Use frequency arrays of size 26 for characters
- Build frequency of pattern string `p`
- Use a fixed-size sliding window on string `s`
- Update window frequency incrementally
- Compare window frequency with pattern frequency
- Store starting index when frequencies match

Key Learnings:
- Sliding window with fixed size
- Frequency comparison instead of substring matching
- Arrays.equals() for content comparison in Java

Time Complexity: O(n)
Space Complexity: O(1)
