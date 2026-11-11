# same-and

[Original practice problem](https://www.codechef.com/problems/SAME_AND)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To satisfy X_i & X_j = N for all i != j, every element X_i must have all bits of N set. Let X_i = N | Y_i, where Y_i & N = 0. The condition (N | Y_i) & (N | Y_j) = N simplifies to Y_i & Y_j = 0. We need to find the maximum number of distinct Y_i such that Y_i & N = 0, Y_i > 0 (since X_i must be distinct and X_i & X_j = N, if Y_i = 0, then X_i = N, which can only appear once), and N | Y_i <= M. The bits available for Y_i are those not set in N. We iterate through bits from 0 to 60. If a bit 'b' is not in N, we can potentially include N | (1 << b) if it is <= M. The sequence will be N followed by all such N | (1 << b). If no such Y_i exists, output -1. Time complexity is O(T * log M), space complexity is O(log M).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
