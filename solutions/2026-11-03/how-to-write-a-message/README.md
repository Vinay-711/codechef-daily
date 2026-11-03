# How To Write A Message

Problem: [how-to-write-a-message](https://www.codechef.com/problems/STRAB)

Difficulty: **2501 (official CodeChef rating)**.

Status: **Accepted** — official judge verified.

Submission: [official judge record](https://www.codechef.com/viewsolution/1386283349).

Part of the user-requested hard-only practice set on 2026-11-03. AI-assisted archived practice.

## Approach

First count valid binary A/B runs of every length up to N. Extend a valid bit mask by one bit and reject a forbidden M-bit suffix using the binary interval for X through Y. Then count full messages by their first maximal A/B run: either the whole message is a run, or the run is followed by one of 24 other letters and an independently valid suffix. This decomposition is unique.

Complexity: O(2^N + N^2) time and O(2^N) space.

## Verification

Run `python3 solutions/2026-11-03/how-to-write-a-message/test_solution.py`. Source is compiled into a temporary directory; examples and original boundary cases are checked. Local tests do not establish an Accepted result.
