# pascro

[Original practice problem](https://www.codechef.com/problems/PASCRO)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.
Submission ID: `1390573438`

## Approach

To find the minimum number of rounds Chef needs to change to win, we first calculate the current scores of Chef and Chefina. If Chef's score is already greater than Chefina's, the answer is 0. Otherwise, we need to increase Chef's score and decrease Chefina's score. Changing a round where Chef lost or drew to a win increases the score difference by 1 or 2 respectively. Specifically, if Chef changes a loss to a win, the gap closes by 2. If Chef changes a draw to a win, the gap closes by 1. We greedily prioritize changing losses to wins to close the gap as quickly as possible. Time complexity is O(N) per test case, space complexity is O(N) to store the strings.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
