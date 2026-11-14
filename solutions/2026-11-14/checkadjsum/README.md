# checkadjsum

[Original practice problem](https://www.codechef.com/problems/CHECKADJSUM)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The sum f(A) = sum_{i=1}^{N-1} (A_i + A_{i+1}) can be rewritten as A_1 + 2*A_2 + 2*A_3 + ... + 2*A_{N-1} + A_N. This is equivalent to 2 * sum(A) - (A_1 + A_N). To achieve a target sum X, we need to find two elements A_i and A_j (where i != j) such that A_i + A_j = 2 * sum(A) - X. If such a pair exists, we place A_i at the start and A_j at the end, and fill the remaining N-2 positions with the remaining elements in any order. Since N is small (up to 50), we can iterate through all pairs (i, j) to check for a valid configuration. Time complexity per query is O(N^2), total O(T * Q * N^2).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
