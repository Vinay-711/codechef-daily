# lapin

[Original practice problem](https://www.codechef.com/problems/LAPIN)

Date: 2026-11-06 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The approach uses a frequency array of size 26 to count character occurrences in the first half and subtract them in the second half. If the final array contains only zeros, the string is a lapindrome. Time complexity is O(T * |S|) and space complexity is O(1) as the frequency array size is constant.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
