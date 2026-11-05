# coins

[Original practice problem](https://www.codechef.com/problems/COINS)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem is solved using dynamic programming with memoization. Since n can be up to 10^9, we use a HashMap to store results for values of n that are large, while using a simple array for small values (up to 1,000,000) to optimize performance. The recurrence relation is f(n) = max(n, f(n/2) + f(n/3) + f(n/4)). Time complexity is O(log n) per test case due to the nature of the recursive divisions, and space complexity is O(M) where M is the number of unique states visited.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
