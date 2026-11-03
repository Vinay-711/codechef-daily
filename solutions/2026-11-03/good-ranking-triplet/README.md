# Good Ranking Triplet

Problem: [good-ranking-triplet](https://www.codechef.com/problems/GOODRANK3)

Difficulty: **2501 (official CodeChef rating)**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.codechef.com/viewsolution/1386293814).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

For every bit position, emit four rankings: either bit group first, and numbers ascending or descending within each group. Given any ordered triple (a,b,c), choose a bit separating a from c. Place the group containing a first. The middle contestant shares a group with exactly one endpoint, and one of the two internal numeric orders puts that pair in the required order. Therefore one ranking contains a before b before c. At most 8 bits are needed for N<=250, giving at most 32 rankings.

Complexity: O(N log N) output time and O(N log N) buffered output space.

## Verification

Run `python3 solutions/2026-11-03/good-ranking-triplet/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
