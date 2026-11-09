# hp18

[Original practice problem](https://www.codechef.com/problems/HP18)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The game is a variation of Nim. Each element in the array can be categorized: divisible by a, divisible by b, or both. Elements divisible by both can be taken by either player, but effectively act as a shared resource that doesn't change the parity of moves. Let countA be the number of elements divisible only by a, countB be the number of elements divisible only by b, and countBoth be the number of elements divisible by both. If countBoth > 0, the player who takes the last 'both' element effectively gets an extra turn. Bob wins if countA > countB, otherwise Alice wins. Time complexity is O(N) per test case, space complexity is O(1) excluding input storage.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
