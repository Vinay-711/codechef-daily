# equalmex

[Original practice problem](https://www.codechef.com/problems/EQUALMEX)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To make the MEX of both halves equal to some value X, we need to ensure that for every integer i < X, both halves contain at least one instance of i. If X = 0, we just need to ensure that neither half contains 0. If X > 0, we need at least two instances of every integer from 0 to X-1. If we have only one instance of some integer k < X, we cannot distribute it to both halves, so the MEX of at least one half will be <= k < X. Thus, the condition is: if the MEX of the entire array is M, we can achieve equal MEX if and only if every integer from 0 to M-1 appears at least twice in the input array. Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
