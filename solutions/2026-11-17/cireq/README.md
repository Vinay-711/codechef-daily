# cireq

[Original practice problem](https://www.codechef.com/problems/CIREQ)

Date: 2026-11-17 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To minimize the number of positive arrays, we sort the input array A. For each value x in the sorted array, we track how many times it appears. If a value x appears k times, it means we need at least k arrays to accommodate these elements because each array can hold at most one instance of a value x at index x or greater. By counting the frequency of each value and finding the maximum frequency of any value x that satisfies the condition (where the count of elements <= x is at least the number of arrays), we determine the minimum number of arrays. The time complexity is O(N log N) due to sorting, and space complexity is O(N) to store the counts.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
