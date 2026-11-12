# spcp3

[Original practice problem](https://www.codechef.com/problems/SPCP3)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.
Submission ID: `1390572683`

## Approach

The problem asks for the minimum number of moves to make A divisible by B. Since the total number of marbles S = A + B is constant, we need to find a pair (a, b) such that a + b = S, a >= 1, b >= 1, and a % b == 0, minimizing |A - a|. We iterate through all possible values of b from 1 to S-1, calculate a = S - b, check the divisibility condition, and track the minimum absolute difference |A - a|. Time complexity is O(T * (A+B)), which is well within limits for A, B <= 1000.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
