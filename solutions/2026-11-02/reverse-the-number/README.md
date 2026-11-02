# Reverse The Number

Problem: https://www.codechef.com/problems/FLOW007

AI-assisted archived practice in Java.

## Approach

Remove the least significant digit and append it to an accumulator. Each iteration reduces the remaining prefix by a factor of ten. Numeric accumulation naturally removes leading zeros of the reversed result.

Complexity: O(log N) time per case and O(1) auxiliary space, excluding batched output.

## Verification

999 cases including all samples, powers of ten, trailing zeros, palindromes and consecutive small values, checked independently by string reversal.

Run `python3 test_solution.py` in this folder; a local JDK is required.

Judge verdict: **Correct Answer (100%)**. [Submission 1385622993](https://www.codechef.com/viewsolution/1385622993), verified in the official practice UI on November 2, 2026.
