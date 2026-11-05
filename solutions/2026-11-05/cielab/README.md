# cielab

[Original practice problem](https://www.codechef.com/problems/CIELAB)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

Calculate the correct difference A - B. To ensure the result has the same number of digits and is positive, we modify the last digit of the result. If the last digit is not 1, we increment it by 1; otherwise, we change it to 2. This guarantees the result is different by exactly one digit and avoids leading zeros or changing the number of digits. Time complexity is O(1), space complexity is O(1).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
