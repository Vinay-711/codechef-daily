# fizzbuzz2305

[Original practice problem](https://www.codechef.com/problems/FIZZBUZZ2305)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The game ends when N has no odd prime factors. This happens if N is even and has no odd prime factors (i.e., N is a power of 2) or N=0. If N is odd, Alice can subtract N itself (if N is prime) or any odd prime factor. If N is odd, Alice can always reach an even number. If N is even, any odd prime factor p subtracted from N results in an odd number. By analyzing small cases, we find that if N is odd, Alice wins. If N is even, Alice loses because any move she makes results in an odd number, and from an odd number, Bob can always reach 0 or another even number. Thus, Alice wins if N is odd, and Bob wins if N is even. Time complexity: O(1) per test case. Space complexity: O(1).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
