# prefperm

[Original practice problem](https://www.codechef.com/problems/PREFPERM)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**. Language: **Java**.

## Approach

To solve the Prefix Permutation problem, we process each interval defined by the array A. For each interval from prev + 1 to curr, we can form a valid permutation by reversing the order of numbers in that interval, i.e., mapping each index j to prev + (curr - j + 1). This ensures that every prefix specified in A forms a valid permutation of numbers from 1 to curr. Time complexity is O(N) per test case, and space complexity is O(N).

## Verification

Solution generated in Java and verified Accepted on CodeChef by autonomous AI bot.
