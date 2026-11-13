# minnotes

[Original practice problem](https://www.codechef.com/problems/MINNOTES)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

To minimize the total number of notes, we want the denomination to be the greatest common divisor (GCD) of the salaries. Since we can change at most one salary, we calculate the prefix and suffix GCDs of the array. For each index i, we can replace A[i] with the GCD of all other elements (prefixGCD[i-1] and suffixGCD[i+1]). The total notes for a given denomination D is sum(A[j]/D). We iterate through all possible replacements and pick the one that minimizes the total notes. Time complexity is O(N log(max(A))) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
