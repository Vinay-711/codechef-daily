# goodset

[Original practice problem](https://www.codechef.com/problems/GOODSET)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To ensure no three distinct elements a, b, c satisfy a + b = c, we can pick odd numbers starting from 251 up to 500. Since the sum of any two odd numbers is even, and we only pick odd numbers, the sum of any two elements will never be in the set. The time complexity is O(T * n) and space complexity is O(n).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
