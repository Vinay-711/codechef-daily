# firstcnt

[Original practice problem](https://www.codechef.com/problems/FIRSTCNT)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

Sort the array A while keeping track of original indices. For each sorted element A[i], the range of X values that map to it is determined by the midpoints between A[i] and its neighbors A[i-1] and A[i+1]. Specifically, the interval is ( (A[i-1]+A[i])/2, (A[i]+A[i+1])/2 ]. If A[i] is the smallest or largest, the interval is infinite on one side. Time complexity is O(N log N) due to sorting, space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
