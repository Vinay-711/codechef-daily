# chefprms

[Original practice problem](https://www.codechef.com/problems/CHEFPRMS)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

I precompute all semi-primes up to 200 using a sieve-like approach. A number is semi-prime if it is the product of two distinct primes. Then, for each test case N, I iterate through all possible semi-primes 's' and check if 'N - s' is also a semi-prime. Time complexity is O(N^2) per test case or O(N^2 + T) overall, which is well within limits for N=200.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
