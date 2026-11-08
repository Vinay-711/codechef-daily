# pascro

[Original practice problem](https://www.codechef.com/problems/PASCRO)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To win, Chef needs a score strictly greater than Chefina's. We calculate the initial scores of Chef and Chefina. If Chef's score is already greater, the answer is 0. Otherwise, we need to change rounds where Chef lost or drew to wins. Each change can increase Chef's score by 1 and decrease Chefina's score by 1 (if it was a loss) or just increase Chef's score by 1 (if it was a draw). The greedy approach is to change rounds where Chef lost first, as that provides a net gain of 2 points relative to Chefina. Time complexity is O(N) per test case, space complexity is O(N) to store the strings.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
