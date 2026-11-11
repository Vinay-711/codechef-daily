# permgcd

[Original practice problem](https://www.codechef.com/problems/PERMGCD)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To achieve a sum of GCDs equal to X, we can fix the GCD of the first k elements to be some integer g. If we pick the first k elements as multiples of g (g, 2g, ..., kg), the prefix GCDs will be g, g, ..., g (k times), contributing k*g to the sum. The remaining n-k elements can be arranged such that their prefix GCDs become 1. The total sum is k*g + (n-k)*1 = k*g + n - k = k(g-1) + n. We iterate through possible values of g from 1 to n, check if (X-n) is divisible by (g-1), and if the resulting k is valid (1 <= k <= n/g). Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
