# Helping Chef

Problem: [helping-chef](https://www.codechef.com/problems/FLOW008)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [judge record](https://www.codechef.com/viewsolution/1386051758).

## Approach

For each input independently compare N with 10. Negative numbers also satisfy the strict inequality. Accumulate one correctly cased output line per test.

Complexity: O(T) time and O(T) output storage.

## Verification

Run `python3 solutions/2026-11-03/helping-chef/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.
