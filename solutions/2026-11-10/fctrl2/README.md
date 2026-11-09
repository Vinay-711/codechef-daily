# fctrl2

[Original practice problem](https://www.codechef.com/problems/FCTRL2)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

Since n! for n=100 exceeds the capacity of long, I used java.math.BigInteger to handle arbitrary-precision arithmetic. The time complexity is O(T * N^2) due to BigInteger multiplication, which is well within limits for N=100 and T=100.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
