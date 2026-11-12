# rrsum

[Original practice problem](https://www.codechef.com/problems/RRSUM)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks for the number of pairs (a, b) with 1 <= a <= N and N + 1 <= b <= 2N such that a + b = q. Rewriting b as N + b' where 1 <= b' <= N, the equation becomes a + b' = q - N. Let x = q - N. We need to find the number of pairs (a, b') with 1 <= a, b' <= N such that a + b' = x. If x < 2 or x > 2N, the answer is 0. If 2 <= x <= N + 1, the number of valid pairs is x - 1. If N + 1 < x <= 2N, the number of valid pairs is 2N - x + 1. Each query can thus be answered in O(1) time.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
