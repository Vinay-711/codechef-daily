# tctctoe

[Original practice problem](https://www.codechef.com/problems/TCTCTOE)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The solution validates the state of a Tic-Tac-Toe board by counting X and O symbols. A state is reachable if the number of X's equals O's or X's equals O's + 1. It then checks for winning conditions for both players. If both win, or if X wins when X count == O count, or if O wins when X count > O count, the state is invalid (3). If the game is finished (someone won or board is full), it returns 1. Otherwise, it returns 2. Time complexity is O(1) per test case as the board size is fixed at 3x3.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
