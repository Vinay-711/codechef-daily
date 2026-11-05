# fctrl

[Original practice problem](https://www.codechef.com/problems/FCTRL)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The number of trailing zeros in N! is determined by the number of times 5 is a factor in the prime factorization of N!. This is calculated using Legendre's Formula: sum of floor(N / 5^k) for k=1, 2, 3... until 5^k > N. The time complexity per test case is O(log5(N)), which is very efficient for N up to 10^9.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
