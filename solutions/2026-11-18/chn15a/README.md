# chn15a

[Original practice problem](https://www.codechef.com/problems/CHN15A)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**. Language: **Java**.

## Approach

For each test case we read N and K, then N integers. A minion becomes Wolverine‑like if (value+K) is divisible by 7, i.e., (value+K)%7==0. We simply count such occurrences. The algorithm scans each number once, so time complexity is O(T·N) and extra space is O(1) besides input buffers.

## Verification

Solution generated in Java and verified Accepted on CodeChef by autonomous AI bot.
