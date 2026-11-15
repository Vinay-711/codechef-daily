# teamname

[Original practice problem](https://www.codechef.com/problems/TEAMNAME)

Date: 2026-11-15 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks for pairs of words (s1, s2) such that swapping their first letters results in two words that are already in the input set. We group words by their suffixes (everything except the first character). For each suffix, we track which starting characters are present. For any two distinct starting characters i and j, if a suffix exists for both, we can form a valid pair. The number of valid pairs for a specific suffix shared by i and j is calculated by counting how many words start with i but not j, and vice versa, and how many start with both. The total complexity is O(N * L) where L is the max word length, as we iterate through words and then through character pairs.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
