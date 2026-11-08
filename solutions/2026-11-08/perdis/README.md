# perdis

[Original practice problem](https://www.codechef.com/problems/PERDIS)

Date: 2026-11-08 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks for the minimum number of swaps to ensure P[i] != i+1 for all i. If P[i] == i+1, we must swap it. By iterating through the array, if we find P[i] == i+1, we can swap it with the next element (P[i+1]) to fix both positions if possible, or just one. Since we want to minimize swaps, we greedily swap adjacent elements whenever a conflict is found. This is equivalent to counting how many disjoint pairs (i, i+1) have conflicts or handling single conflicts, which simplifies to ceil(count/2) if we can pair them, but actually, since we can swap any adjacent elements, each swap can resolve at most two conflicts. The greedy strategy of swapping P[i] with P[i+1] whenever P[i] == i+1 effectively resolves conflicts in O(N) time and O(N) space.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
