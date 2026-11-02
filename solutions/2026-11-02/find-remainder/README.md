# Find Remainder

Problem: https://www.codechef.com/problems/FLOW002

AI-assisted archived practice in Java.

## Approach

Apply Java integer remainder to each positive pair. The remainder is the unique nonnegative number smaller than B for which A minus the remainder is divisible by B.

Complexity: O(1) time and auxiliary space per case, excluding batched output.

## Verification

907 sample and edge cases: divisor one, equal operands, A smaller than B, upper limits, and every positive pair up to 30 checked against division invariants.

Run `python3 test_solution.py` in this folder; a local JDK is required.

Judge verdict: **Correct Answer (100%)**. [Submission 1385623659](https://www.codechef.com/viewsolution/1385623659), verified in the official practice UI on November 2, 2026.
