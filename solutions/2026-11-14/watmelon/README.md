# watmelon

[Original practice problem](https://www.codechef.com/problems/WATMELON)

Date: 2026-11-14 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks if we can make the sum of the sequence equal to 0 by subtracting i from A[i] any number of times. Let k_i be the number of times we subtract i from A[i]. The new sum is sum(A[i] - k_i * i) = 0, which simplifies to sum(A[i]) = sum(k_i * i). This is a variation of the subset sum problem or partition problem where we need to check if the total sum S = sum(A[i]) can be represented as a linear combination of integers {1, 2, ..., N} with non-negative coefficients k_i. Since we can choose any k_i >= 0, we can represent any non-negative integer S as a sum of 1s (k_1 = S, k_2=0, ...). Thus, the condition is simply that the initial sum must be >= 0. Time complexity is O(N) per test case, space complexity is O(1).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
