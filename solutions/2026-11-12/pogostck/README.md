# pogostck

[Original practice problem](https://www.codechef.com/problems/POGOSTCK)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

We can compute the maximum total points by processing the array backwards from index N-1 down to 0 using dynamic programming. For each index `i`, the maximum points gathered starting from `i` is equal to `A[i] + dp[i + K]` if `i + K < N`, or simply `A[i]` if `i + K >= N`. The overall answer for a test case will be the maximum value in `dp`. Time complexity per testcase is O(N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
