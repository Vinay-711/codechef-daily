# constr

[Original practice problem](https://www.codechef.com/problems/CONSTR)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks for the shortest string S that can generate U by replacing any character with 3 copies of itself. This implies that any sequence of identical characters in U of length L can be reduced to a single character if L is of the form (3^k), but more generally, we can reduce any block of identical characters of length L to a single character if L can be represented as a sum of powers of 3. However, the problem states we can replace a character with 3 copies, meaning we can turn 1 char into 3, 9, 27, etc. This is equivalent to saying that if we have a block of identical characters of length L, we can reduce it to a single character if L = 1 + 3 + 9 + ... + 3^k. Actually, the rule is simpler: we can replace one character with three. This means we can turn 1 into 3, 3 into 9, etc. Any block of identical characters of length L can be reduced to a single character if L is of the form 1 + 2 * (some integer) is not the case, but rather that any block of identical characters can be reduced to a single character if we can reach length L by repeatedly adding 2 to the count (since 1 -> 3 is +2). Thus, any block of length L can be reduced to 1 if L % 2 == 1. If L is even, we can reduce it to 2 characters. Therefore, for each contiguous block of identical characters of length L, we keep 1 character if L is odd, and 2 characters if L is even.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
