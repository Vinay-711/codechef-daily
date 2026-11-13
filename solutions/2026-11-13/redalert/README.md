# redalert

[Original practice problem](https://www.codechef.com/problems/REDALERT)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem is solved by simulating the water level day by day. We maintain a current water level variable, update it based on the rain amount (A_i > 0) or the drainage rule (A_i = 0), and check if it exceeds H at any point. The time complexity is O(N) per test case, and space complexity is O(1).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
