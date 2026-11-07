# covsprd

[Original practice problem](https://www.codechef.com/problems/COVSPRD)

Date: 2026-11-07 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem requires calculating the number of infected people based on exponential growth rules. For days 0-10, the population doubles daily. From day 11 onwards, it triples daily. Since the population N is capped at 10^8, we use long to prevent overflow and cap the result at N. The time complexity is O(T) as we perform constant time calculations per test case, and space complexity is O(1).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
