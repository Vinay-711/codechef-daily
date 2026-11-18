# adastair

[Original practice problem](https://www.codechef.com/problems/ADASTAIR)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**. Language: **Java**.

## Approach

We iterate through the steps and for each gap between consecutive steps (including the start at height 0), we calculate the number of intermediate steps needed such that no single jump exceeds K. The number of additions required for a gap of length diff is (diff - 1) / K. Time complexity is O(N) per test case and space complexity is O(N).

## Verification

Solution generated in Java and verified Accepted on CodeChef by autonomous AI bot.
