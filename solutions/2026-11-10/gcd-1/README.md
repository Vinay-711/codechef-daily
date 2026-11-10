# gcd-1

[Original practice problem](https://www.codechef.com/problems/GCD_1)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To ensure the GCD of every row and column is 1, we can use a diagonal-based approach. By placing prime numbers along the diagonal and filling other cells with values that ensure the GCD condition, we satisfy the constraints. Specifically, we can use a sequence of primes and ensure that for any row i and column j, the GCD is 1. A simple construction is to use a matrix where A[i][j] = P[i+j] where P is a sequence of primes, but since we just need GCD 1, we can use a simpler pattern: A[i][j] = (i+j)th prime. Given the constraints and the easy version requirement, we can use a simple construction: A[i][j] = P[i] + P[j] where P is a list of primes. Since P[i] and P[j] are primes, their sum is coprime to many numbers, and we can adjust to ensure GCD 1. A more robust way is to use A[i][j] = P[i] * P[j] + 1 or similar, but simply using a sequence of primes P[k] such that P[i] + P[j] works for small N, M. Actually, the simplest valid construction is A[i][j] = P[i+j] where P is a sequence of primes. Time complexity is O(N*M), space complexity is O(N+M) to store primes.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
