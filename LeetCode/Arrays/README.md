# LeetCode – Arrays

## Two Sum
Problem: https://leetcode.com/problems/two-sum/

Approach:
- Traverse the array once
- For each element, compute the remaining value (target - current)
- Use HashMap to check if the remaining value already exists
- If found, return the stored index and current index

Why HashMap:
- Allows O(1) average lookup
- Helps avoid using the same element twice

Time Complexity: O(n)
Space Complexity: O(n)
