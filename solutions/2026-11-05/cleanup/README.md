# cleanup

[Original practice problem](https://www.codechef.com/problems/CLEANUP)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem is solved by using a boolean array to track finished jobs. We iterate from 1 to n, identify unfinished jobs, and distribute them alternately between the Chef and the assistant using a toggle flag. Time complexity is O(T * n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
