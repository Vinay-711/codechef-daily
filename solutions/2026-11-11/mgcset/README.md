# mgcset

[Original practice problem](https://www.codechef.com/problems/MGCSET)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

A sequence is 'good' if every non-empty subsequence has a sum divisible by m. This condition holds if and only if every element in the sequence is divisible by m. If we have k elements in the original array that are divisible by m, any non-empty subsequence formed by these k elements will have a sum divisible by m. The number of such non-empty subsequences is 2^k - 1. Time complexity is O(T * n), space complexity is O(1).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
