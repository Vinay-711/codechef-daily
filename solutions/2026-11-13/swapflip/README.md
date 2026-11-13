# swapflip

[Original practice problem](https://www.codechef.com/problems/SWAPFLIP)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The operations allow us to swap any two elements and flip any two elements. Swapping means we can reorder the string arbitrarily, so only the count of 1s matters. Flipping two elements means we can change the parity of the number of 1s by 0 or 2. Thus, the parity of the number of 1s in S must match the parity of the number of 1s in T. Since we can swap any two elements, we can effectively move any 1s to any positions. The flip operation allows us to change two bits at a time, which preserves the parity of the total count of 1s. Therefore, the condition is simply that the number of 1s in S and T must have the same parity. Time complexity is O(N) per test case, space complexity is O(N).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
