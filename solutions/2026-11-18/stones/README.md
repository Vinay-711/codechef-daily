# stones

[Original practice problem](https://www.codechef.com/problems/STONES)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**. Language: **Java**.

## Approach

For each test case we store all characters of the jewel string J in a boolean array of size 128 (ASCII). Then we scan the stone string S and increment a counter whenever the current character is marked as a jewel. This runs in O(|J|+|S|) time per test case with O(1) extra space (the fixed-size boolean array).

## Verification

Solution generated in Java and verified Accepted on CodeChef by autonomous AI bot.
