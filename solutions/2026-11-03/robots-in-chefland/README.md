# Robots In Chefland

Problem: [robots-in-chefland](https://www.codechef.com/problems/ROBOTS)

Difficulty: **2505 (official CodeChef rating)**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.codechef.com/viewsolution/1386302460).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Use integer axial coordinates on the hexagonal grid and prefix sums of both orientation and displacement. A substring displacement is the difference of two global prefix positions, rotated clockwise by the orientation accumulated before the substring. Clockwise 60-degree rotation maps (u,v) to (u+v,-u). Only at output convert to Cartesian coordinates (u+v/2, sqrt(3)v/2). Integer accumulation avoids drift, and a fixed eight-decimal formatter respects the stated output-size limit.

Complexity: O(N+Q) time and O(N+Q) space including buffered output.

## Verification

Run `python3 solutions/2026-11-03/robots-in-chefland/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
