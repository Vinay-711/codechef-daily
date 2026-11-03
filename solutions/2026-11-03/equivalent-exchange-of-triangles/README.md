# Equivalent Exchange Of Triangles

Problem: [equivalent-exchange-of-triangles](https://www.codechef.com/problems/LEQEX)

Difficulty: **2501 (official CodeChef rating)**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.codechef.com/viewsolution/1386286421).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

A usable odd-length segment has exactly one color appearing an odd number of times. Encode color-count parity in a 30-bit prefix mask. For each new prefix, examine masks differing in one bit and use the earliest matching prefix to maximize segment length. Pair all even counts and reserve the single odd triangle for the roof.

Complexity: O(30N) expected time and O(N) space.

## Verification

Run `python3 solutions/2026-11-03/equivalent-exchange-of-triangles/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
