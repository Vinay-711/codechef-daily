# xorperm

[Original practice problem](https://www.codechef.com/problems/XORPERM)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**. Language: **Java**.

## Approach

We can solve this problem by providing a base valid permutation for N=5, which is {5, 1, 2, 4, 3}. For any N > 5, we can simply append numbers from 6 to N in increasing order. For N < 5, except N=3 (which is impossible), N=4 is also impossible based on check. For N=3 and N=4, output -1. Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified Accepted on CodeChef by autonomous AI bot.
