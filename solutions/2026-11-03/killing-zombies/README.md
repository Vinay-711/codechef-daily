# Killing Zombies

Problem: [killing-zombies](https://www.codechef.com/problems/CLKLZM)

Difficulty: **2505 (official CodeChef rating)**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.codechef.com/viewsolution/1386301320).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

Sweep zombies from left to right and track damage from already chosen beams using expiration events. When the current zombie still needs damage, choose an available crane reaching farthest right and use as much remaining capacity as needed. Any beam covering this zombie can be exchanged for a farther-reaching available beam without harming future coverage, proving the greedy choice optimal. A max heap tracks cranes and a difference array expires their effects.

Complexity: O((N+M) log M) time and O(N+M) space.

## Verification

Run `python3 solutions/2026-11-03/killing-zombies/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
