# orops

[Original practice problem](https://www.codechef.com/problems/OROPS)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The bitwise OR of all elements in the array is invariant under the specified OR operation. Therefore, if we partition the array into k contiguous subarrays such that the bitwise OR of each subarray equals the total OR of the entire array (X), all resulting elements after reducing each subarray will be equal to X. To minimize the number of operations (which equals N - k), we need to maximize the number of valid subarrays k. We can greedily form subarrays from left to right, closing a subarray as soon as its accumulated bitwise OR equals X. Time complexity per test case is O(N) and auxiliary space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
