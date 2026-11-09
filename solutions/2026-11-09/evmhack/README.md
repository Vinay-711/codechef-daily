# evmhack

[Original practice problem](https://www.codechef.com/problems/EVMHACK)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks if Chef can win by hacking at most one EVM. We calculate the total votes cast (P+Q+R) and the threshold for winning (total/2). We then check the total votes Chef would have if he hacks the first, second, or third EVM, or none at all. If any of these scenarios result in votes > threshold, the answer is YES. Time complexity is O(T) and space complexity is O(1).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
