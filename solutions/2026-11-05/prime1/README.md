# prime1

[Original practice problem](https://www.codechef.com/problems/PRIME1)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To find primes in a range [m, n] where n is up to 10^9 but the range size is small (10^5), we use a segmented sieve. First, precompute primes up to sqrt(10^9) ≈ 31622 using a simple sieve. Then, for each test case, create a boolean array of size (n-m+1) to mark non-primes by iterating through the precomputed primes. Time complexity is O(sqrt(N) log log sqrt(N) + T * (n-m) log log n), space complexity is O(sqrt(N) + (n-m)).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
