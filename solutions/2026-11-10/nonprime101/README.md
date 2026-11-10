# nonprime101

[Original practice problem](https://www.codechef.com/problems/NONPRIME101)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

Since the array elements are small (up to 100), the sum of any two elements is at most 200. We can precompute primes up to 200 using a sieve. For each test case, we store the indices of each number from 1 to 100. We then iterate through all possible pairs of values (v1, v2) from 1 to 100. If v1 + v2 is not prime and we have enough indices (either two distinct indices for the same value or one index each for different values), we return the indices. This approach is O(N + 100^2) per test case, which is well within the time limits.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
