# qtoo-2523

[Original practice problem](https://www.codechef.com/problems/QTOO_2523)

Date: 2026-11-23 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**. Language: **Java**.

## Approach

If any character appears at least twice, we can keep those two as a palindrome of length 2, deleting N‑2 characters, which is maximal. Otherwise all characters are distinct, no palindrome of length >1 exists, so answer is –1. Time O(N) per test case, memory O(1).

## Verification

Solution generated in Java and verified Accepted on CodeChef by autonomous AI bot.
