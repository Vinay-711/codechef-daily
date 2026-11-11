# ks2

[Original practice problem](https://www.codechef.com/problems/KS2)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The N-th round integer is formed by taking N, calculating the sum of its digits, and appending a digit (0-9) such that the total sum is a multiple of 10. Since the sum of digits of N is S, we need (S + x) % 10 == 0, which means x = (10 - (S % 10)) % 10. This approach is O(log N) per test case, which is optimal for N up to 10^18.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
