# Minimum Or Path

Problem: [minimum-or-path](https://www.codechef.com/problems/MINORPATH)

Difficulty: **2501 (official CodeChef rating)**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.codechef.com/viewsolution/1386296627).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

For a proposed bit mask, only visit entries whose set bits are contained in the mask. Scan reachable indices while maintaining the farthest next index reachable from an allowed entry; also require the start and destination values to be allowed. Feasibility is monotone under adding allowed bits. Starting with all 19 bits, greedily clear bits from most significant to least whenever a path still exists. A cleared high bit dominates every lower-bit choice, proving minimality.

Complexity: O(19N) time and O(N) space.

## Verification

Run `python3 solutions/2026-11-03/minimum-or-path/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
