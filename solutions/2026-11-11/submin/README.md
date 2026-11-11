# submin

[Original practice problem](https://www.codechef.com/problems/SUBMIN)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

Since N is small (up to 50), we can precompute the minimum of all possible subarrays in O(N^2) time and store the frequency of each minimum value in a frequency array (or map). For each query, we simply look up the frequency of K in O(1) time. Total time complexity is O(N^2 + Q), and space complexity is O(max(A_i)).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
