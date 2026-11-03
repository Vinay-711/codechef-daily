# Triangle Count Hard

Problem: [triangle-count-hard](https://www.codechef.com/problems/TRICOUNT2)

Difficulty: **2502 (official CodeChef rating)**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.codechef.com/viewsolution/1386299906).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

For sorted positive sides a<b, the valid third sides form the integer interval [b-a+1,a+b-1]. For a fixed b, the interval from its largest available smaller side contains all intervals from smaller alternatives, so adjacent sorted pairs suffice. When inserting x, add intervals to its predecessor and successor. The old predecessor-successor interval can be retained because the new x-successor interval contains it. Maintain the union of all added intervals as disjoint ranges in a TreeMap, merging overlaps and adjacent integer ranges and tracking total covered length. Each range is inserted and removed at most once.

Complexity: O(N log N) amortized time and O(N) space.

## Verification

Run `python3 solutions/2026-11-03/triangle-count-hard/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
