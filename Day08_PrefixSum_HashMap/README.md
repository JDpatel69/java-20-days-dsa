# Day 8 – Prefix Sum + HashMap

Problem:
LeetCode 560 – Subarray Sum Equals K

Idea:
Instead of checking all subarrays, we use prefix sums.
If the difference between two prefix sums equals k, then the subarray between them has sum k.

Key Insight:
For current prefix sum S,
if a previous prefix sum (S - k) exists,
then a subarray ending at the current index sums to k.

Approach:
- Maintain a running prefix sum
- Use a HashMap to store prefixSum -> frequency
- Initialize the map with (0 -> 1) to handle subarrays starting at index 0
- For each element:
  - Update the prefix sum
  - Check if (prefixSum - k) exists in the map
  - If yes, add its frequency to the count
  - Update the frequency of the current prefix sum in the map

Why HashMap Frequency Matters:
The same prefix sum can appear multiple times.
Each occurrence represents a different valid subarray.

Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
- Prefix sums convert subarray problems into difference problems
- HashMap stores history of sums, not subarrays
- This approach works even with negative numbers
