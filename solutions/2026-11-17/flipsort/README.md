# flipsort

[Original practice problem](https://www.codechef.com/problems/FLIPSORT)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To make the string non-decreasing, we iterate from right to left. If we find a '1' at index i followed by a '0' at index i+1, we flip the prefix of length i+1. This effectively flips the '1' at i to '0' and changes the subsequent bits. By processing from right to left, we ensure that once a suffix is sorted, it remains sorted. Each operation uses a unique length X = i+1, satisfying the problem constraint. Time complexity is O(N^2) due to string updates, space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
