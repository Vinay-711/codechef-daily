# minvote

[Original practice problem](https://www.codechef.com/problems/MINVOTE)

Date: 2026-11-16 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem requires counting how many minions j vote for minion i. Minion j votes for i if S[j] >= sum(S[k]) for all k between i and j. This is equivalent to finding the range [L, R] for each minion i such that for any j in [L, R] (j != i), the condition holds. We use prefix sums to calculate the sum of influence levels between any two indices in O(1) and binary search to find the boundaries L and R for each minion i in O(log N). We then use a difference array to update the vote counts in O(N) total time. The overall time complexity is O(T * N log N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
