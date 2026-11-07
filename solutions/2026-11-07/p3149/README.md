# p3149

[Original practice problem](https://www.codechef.com/problems/P3149)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To maximize the subarray sum, we want to keep all positive numbers and remove all negative numbers that lie between positive numbers if they decrease the total sum. Specifically, for any subarray, we want to remove all negative numbers within it to maximize its sum. The minimum operations required is the count of negative numbers within the subarray that yields the maximum possible sum. We iterate over all possible subarrays (L, R), calculate the sum by ignoring negative numbers, and count how many negative numbers were removed. The time complexity is O(N^3) per test case, which is well within limits for N=100.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
