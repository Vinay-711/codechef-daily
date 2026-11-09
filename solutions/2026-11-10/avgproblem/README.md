# avgproblem

[Original practice problem](https://www.codechef.com/problems/AVGPROBLEM)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem asks to check if (A + B) / 2 > C. To avoid floating point precision issues, we multiply both sides by 2, resulting in the condition (A + B) > 2 * C. This approach runs in O(T) time complexity and O(1) space complexity.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
