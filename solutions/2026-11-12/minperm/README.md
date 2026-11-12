# minperm

[Original practice problem](https://www.codechef.com/problems/MINPERM)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To find the lexicographically smallest good permutation, we swap adjacent elements in pairs (i, i+1) to (i+1, i). If n is odd, the last three elements (n-2, n-1, n) are arranged as (n-1, n, n-2) to ensure all elements satisfy p[i] != i. This approach is O(n) time and O(n) space.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
