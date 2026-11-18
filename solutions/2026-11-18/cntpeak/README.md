# cntpeak

[Original practice problem](https://www.codechef.com/problems/CNTPEAK)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**. Language: **Java**.

## Approach

Since N <= 10, we can use backtracking/DFS to generate all 3^N arrays of length N with elements from {0, 1, 2}. For each array, we count its extrema and sum them up over all 3^N possibilities. Alternatively, we can use dynamic programming or precomputation, but with N <= 10, 3^10 = 59049, which is extremely small and DFS is well within the time limit. Time complexity is O(3^N) per test case, and space complexity is O(N) for recursion depth.

## Verification

Solution generated in Java and verified Accepted on CodeChef by autonomous AI bot.
