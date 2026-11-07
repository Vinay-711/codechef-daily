# altaray

[Original practice problem](https://www.codechef.com/problems/ALTARAY)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

We iterate backwards from the end of the array to the beginning. For each index i, if the sign of A[i] is different from A[i+1], the length of the longest alternating subarray starting at i is 1 + length at i+1. Otherwise, it is 1. This approach has O(N) time complexity and O(N) space complexity.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
