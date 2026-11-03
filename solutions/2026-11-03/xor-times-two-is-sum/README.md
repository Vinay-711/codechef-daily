# Xor Times Two Is Sum

Problem: [xor-times-two-is-sum](https://www.codechef.com/problems/XORXORSUM)

Difficulty: **2502 (official CodeChef rating)**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.codechef.com/viewsolution/1386297930).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Using a+b=(a XOR b)+2(a AND b), the target equation becomes a XOR b=2(a AND b). For a fixed a, recover b bit by bit: its current bit is the bit of a XOR the preceding bit of (a AND b). The preceding AND bit starts at zero, so the partner is unique. Compute through bit 60, look up that partner in the set of distinct inputs, and count only a<b to avoid double counting.

Complexity: O(61N) expected time and O(N) space.

## Verification

Run `python3 solutions/2026-11-03/xor-times-two-is-sum/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
