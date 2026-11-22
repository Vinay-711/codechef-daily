# airline

[Original practice problem](https://www.codechef.com/problems/AIRLINE)

Date: 2026-11-22 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**. Language: **Java**.

## Approach

The solution checks all three possible ways Chef can arrange her bags: carrying bag A, B, or C. For each scenario, it verifies if the chosen carry-on bag's weight is within limit E AND the sum of the other two bags (checked-in) is within limit D. If any of these three scenarios satisfy both conditions, it's possible, and "YES" is printed. Otherwise, "NO" is printed. Fast I/O (BufferedReader, StringTokenizer, StringBuilder) is used for efficiency. The time complexity is O(T) because each test case involves a constant number of arithmetic operations and comparisons. The space complexity is O(1) beyond input storage, or O(L) where L is the total length of output strings.

## Verification

Solution generated in Java and verified Accepted on CodeChef by autonomous AI bot.
