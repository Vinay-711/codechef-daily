# marbles

[Original practice problem](https://www.codechef.com/problems/MARBLES)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To choose $n$ marbles of $k$ different colors such that each color is represented at least once, we first place 1 marble of each of the $k$ colors. This leaves $n - k$ marbles to be distributed among the $k$ colors with no restrictions. Using the Stars and Bars theorem, the number of ways to distribute $n - k$ indistinguishable items into $k$ distinguishable bins is given by $\binom{(n - k) + k - 1}{k - 1} = \binom{n - 1}{k - 1}$.

We can compute $\binom{N}{R}$ where $N = n - 1$ and $R = k - 1$. Since $\binom{N}{R} = \binom{N}{N - R}$, we replace $R$ with $\min(R, N - R)$. Given that the problem guarantees the result fits into a signed 64-bit integer, $R$ will be very small ($\le 62$). We iteratively compute the product using `BigInteger` to avoid intermediate integer overflow.

Time Complexity: $O(\min(k, n-k))$ per test case, which is at most $O(62)$. Overall time complexity is $O(T \times \min(k, n-k))$, running well within the 1-second limit.
Space Complexity: $O(1)$ auxiliary space.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
