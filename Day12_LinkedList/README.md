# Day 12 – Linked List (Remove Nth Node From End)

Problem:
LeetCode 19 – Remove Nth Node From End of List

Approach:
- Use a dummy node before head to handle edge cases
- Use two pointers (fast and slow)
- Move fast pointer n+1 steps ahead to create a gap
- Move both pointers together until fast reaches null
- Slow pointer will be just before the node to remove
- Remove node by changing links

Key Learning:
- Dummy node simplifies head deletion
- Two-pointer technique avoids extra traversal
- One-pass solution

Time Complexity: O(n)
Space Complexity: O(1)
