# rrstone

[Original practice problem](https://www.codechef.com/problems/RRSTONE)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The transformation A[i] = MAX - A[i] is periodic. After the first transformation, the array values become non-negative. A second transformation results in a state that repeats every two steps. If K is 0, the array remains unchanged. If K > 0, we perform the first transformation, and if K is even, we perform a second transformation to reach the stable cycle. Time complexity is O(N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
