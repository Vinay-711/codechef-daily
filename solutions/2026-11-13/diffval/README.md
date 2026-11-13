# diffval

[Original practice problem](https://www.codechef.com/problems/DIFFVAL)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks if we can rearrange a binary string such that S[i] != S[i+K]. This condition implies that for each of the K independent chains formed by indices (i, i+K, i+2K, ...), adjacent elements must be different. This is only possible if each chain is alternating (e.g., 0, 1, 0, 1...). For a chain of length L, we need floor((L+1)/2) of one character and floor(L/2) of the other. We count the total number of 0s and 1s available and check if they can satisfy the requirements of all K chains. Specifically, for each chain, we calculate the minimum required 0s and 1s and check if the total counts of 0s and 1s in the string are sufficient. Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
