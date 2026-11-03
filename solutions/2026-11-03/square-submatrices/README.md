# Square Submatrices

Problem: [square-submatrices](https://www.codechef.com/problems/SQRSUBMA)

Difficulty: **2501 (official CodeChef rating)**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.codechef.com/viewsolution/1386288579).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

For side length k, a square sum equals k times the sum of one length-k window of A for its rows and another for its columns. Therefore k must divide X. Positive elements also imply 2k^2 <= X. For each eligible k, count window sums with prefix sums, then count ordered pairs of window sums totaling X/k. Use long for the count because row and column positions can yield more than 32-bit results.

Complexity: O(N d(X) + sum(X/k over eligible k)) time and O(N+X) space, with d(X) eligible divisors.

## Verification

Run `python3 solutions/2026-11-03/square-submatrices/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
