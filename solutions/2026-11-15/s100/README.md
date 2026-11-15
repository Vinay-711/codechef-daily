# s100

[Original practice problem](https://www.codechef.com/problems/S100)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks for the lexicographically smallest string by replacing any substring of length 3 with '100'. To achieve the smallest string, we find the first occurrence of '1' in the string. If this '1' is at an index i such that i <= N-3, we can replace the substring starting at i with '100'. This is optimal because any '1' appearing before this index would make the string lexicographically larger, and replacing the first possible '1' with '100' minimizes the value at the earliest possible position. Time complexity is O(N) per test case, and space complexity is O(N) to store the result.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
