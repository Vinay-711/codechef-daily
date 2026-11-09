# strame

[Original practice problem](https://www.codechef.com/problems/STRAME)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The game involves removing adjacent pairs of '01' or '10'. Each move reduces the total number of '0's and '1's by one each. The total number of moves possible is limited by the minimum count of '0's and '1's in the string. Specifically, the game ends when no more adjacent pairs of different characters exist. This happens when all remaining characters are the same. The total number of moves is exactly min(count0, count1). If this number is odd, the first player (Zlatan) wins; if even, the second player (Ramos) wins. Time complexity is O(N) per test case, space complexity is O(N) to store the string.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
