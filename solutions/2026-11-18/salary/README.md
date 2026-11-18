# salary

[Original practice problem](https://www.codechef.com/problems/SALARY)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**. Language: **Java**.

## Approach

Each operation increases all salaries except one, which is equivalent to decreasing that chosen salary by 1 relative to the others. To make all salaries equal we can think of lowering every worker down to the minimum salary. The number of decrements needed for worker i is Wi - min, so total moves = Σ(Wi - min) = sum - N*min. The algorithm scans the array once to find sum and minimum, then computes the formula. Time complexity O(N) per test case, space O(1) besides input storage.

## Verification

Solution generated in Java and verified Accepted on CodeChef by autonomous AI bot.
