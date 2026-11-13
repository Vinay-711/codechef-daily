# maximscore

[Original practice problem](https://www.codechef.com/problems/MAXIMSCORE)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

For each index i chosen by Alice, Bob will choose an adjacent index j that maximizes |A[i] - A[j]|. Alice wants to minimize this maximum value. We iterate through all possible indices i, calculate the maximum possible score Bob can achieve for that i, and then find the minimum of these values. Time complexity is O(N) per test case, space complexity is O(N) to store the array.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
