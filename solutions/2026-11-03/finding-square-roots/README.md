# Finding Square Roots

Problem: [finding-square-roots](https://www.codechef.com/problems/FSQRT)

Status: **Accepted** — verified on 2026-11-03 (Asia/Kolkata).

Submission: [judge record](https://www.codechef.com/viewsolution/1386054066).

## Approach

Apply Java Math.sqrt and truncate the nonnegative result to obtain the floor. The stated inputs are at most 10000, safely within precise integer representation.

Complexity: O(T) time and O(T) output storage.

## Verification

Run `python3 solutions/2026-11-03/finding-square-roots/test_solution.py` from the repository root. The harness compiles Java into a temporary directory, checks the examples and original boundary cases. Local tests do not establish an accepted verdict.
