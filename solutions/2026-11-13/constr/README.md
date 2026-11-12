# constr

[Original practice problem](https://www.codechef.com/problems/CONSTR)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.
Submission ID: `1390572927`

## Approach

The problem asks for the shortest string S that can generate U by replacing any character with 3 copies of itself. This operation allows us to change a count of 'c' occurrences of a character into 'c + 2' occurrences. Thus, if we have a block of 'k' identical characters, we can reduce it to 'k % 2' if k is odd, or '2' if k is even (since we can't reduce below 2 if the original count was even). We iterate through the string, group consecutive identical characters, and for each group of size 'count', we append the character once if 'count' is odd, or twice if 'count' is even. Time complexity is O(N) and space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
