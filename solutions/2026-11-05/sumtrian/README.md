# sumtrian

[Original practice problem](https://www.codechef.com/problems/SUMTRIAN)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem is solved using dynamic programming. We process the triangle from the bottom up. For each element at row i and column j, we update its value by adding the maximum of the two elements directly below it (row i+1, column j and row i+1, column j+1). This transforms the triangle such that the top element (0,0) eventually contains the maximum path sum. Time complexity is O(N^2) per test case, and space complexity is O(N^2) to store the triangle.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
