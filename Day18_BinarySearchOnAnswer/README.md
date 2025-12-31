# Day 18 – Koko Eating Bananas (Binary Search on Answer)

Problem:
LeetCode 875 – Koko Eating Bananas

Key Idea:
- Binary search on the eating speed (k)
- Minimum speed that allows finishing all bananas within h hours

Approach:
1. Search range: 1 to max(piles)
2. For a candidate speed k, compute total hours needed
3. If hours <= h, try smaller k
4. Else, increase k

Time Complexity:
O(n log maxPile)

Space Complexity:
O(1)

Key Learning:
- Binary search is not only for sorted arrays
- Can be applied on the "answer space"
