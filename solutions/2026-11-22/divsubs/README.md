# divsubs

[Original practice problem](https://www.codechef.com/problems/DIVSUBS)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**. Language: **Java**.

## Approach

The algorithm scans prefix sums modulo N, storing the first index where each remainder appears. When a remainder repeats or becomes zero, the subarray between the stored index+1 and current index has sum divisible by N. This runs in O(N) time and O(N) extra space per test case, satisfying the constraints.

## Verification

Solution generated in Java and verified Accepted on CodeChef by autonomous AI bot.
