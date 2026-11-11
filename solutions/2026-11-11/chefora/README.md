# chefora

[Original practice problem](https://www.codechef.com/problems/CHEFORA)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem requires calculating the product of (A_L)^(A_i) for i from L+1 to R, which simplifies to (A_L)^(sum of A_i from L+1 to R) mod 10^9+7. By Fermat's Little Theorem, the exponent can be taken modulo 10^9+6. We precompute the first 100,000 Chefora numbers (odd-length palindromes) and their prefix sums modulo 10^9+6. The time complexity is O(N + Q log MOD) where N=10^5, and space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
