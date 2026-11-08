# spcp3

[Original practice problem](https://www.codechef.com/problems/SPCP3)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks for the minimum number of transfers to make A divisible by B. Since the total number of marbles S = A + B is constant, we need to find a pair (a, b) such that a + b = S, a % b == 0, a >= 1, and b >= 1, minimizing |A - a|. We iterate through all possible values of b from 1 to S-1, check if (S-b) % b == 0, and calculate the cost |A - (S-b)|. The time complexity is O(T * (A+B)) and space complexity is O(1).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
