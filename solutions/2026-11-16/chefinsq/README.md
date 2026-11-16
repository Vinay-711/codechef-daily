# chefinsq

[Original practice problem](https://www.codechef.com/problems/CHEFINSQ)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To find the number of interesting subsequences of size K with minimum sum, we first sort the array. The minimum sum is achieved by taking the K smallest elements. If the K-th smallest element (in sorted order) appears multiple times, we count how many times it appears in the first K elements (let this be 'countK') and how many times it appears in the entire array (let this be 'totalCount'). The number of ways to choose the remaining elements is given by the combination formula C(totalCount, countK). Time complexity is O(N log N) per test case due to sorting, and space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
