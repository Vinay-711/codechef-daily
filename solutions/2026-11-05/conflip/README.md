# conflip

[Original practice problem](https://www.codechef.com/problems/CONFLIP)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks for the state of N coins after N rounds where in each round k, coins 1 to k are flipped. After N rounds, each coin i (1 <= i <= N) has been flipped exactly N - i + 1 times. If N is even, every coin is flipped an even number of times, meaning they remain in their initial state. If N is odd, coins 1 to N-1 are flipped an even number of times (initial state) and coin N is flipped an odd number of times (opposite state). More generally, N/2 coins will always be flipped an odd number of times, and the remaining N - N/2 coins will be flipped an even number of times. We compare the initial state I and target state Q to determine the count. Time complexity is O(T * G) and space complexity is O(1).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
