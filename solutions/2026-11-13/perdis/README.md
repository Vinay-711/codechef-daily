# perdis

[Original practice problem](https://www.codechef.com/problems/PERDIS)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.
Submission ID: `1390571116`

## Approach

The problem asks for the minimum number of swaps to ensure P[i] != i+1 for all i. If P[i] == i+1, we must swap it. If two adjacent elements are both in their correct positions (P[i] == i+1 and P[i+1] == i+2), a single swap between them fixes both, contributing 1 to the count. If only one element is in its correct position, it still takes 1 swap to fix it. We iterate through the array, greedily pairing adjacent fixed points to minimize operations. Time complexity is O(N) and space complexity is O(N) to store the permutation.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
