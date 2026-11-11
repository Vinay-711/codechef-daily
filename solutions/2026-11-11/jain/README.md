# jain

[Original practice problem](https://www.codechef.com/problems/JAIN)

Date: 2026-11-11 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks to count pairs of strings whose union contains all 5 vowels. Since there are only 2^5 = 32 possible bitmasks representing the presence of vowels in a string, we can pre-calculate the frequency of each mask. We then iterate through all pairs of masks (i, j) and check if (i | j) == 31. If so, we add the product of their frequencies to the total. Special care is taken for the case where i == j to avoid double counting and self-pairing. Time complexity is O(N + 32^2) per test case, space complexity is O(32).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
