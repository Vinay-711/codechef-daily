# llcycle

[Original practice problem](https://www.codechef.com/problems/LLCYCLE)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

Used Floyd's Cycle-Finding Algorithm (Tortoise and Hare). First, detect if a cycle exists using two pointers moving at different speeds. If they meet, reset one pointer to the head and move both at the same speed; the point where they meet again is the start of the cycle. Time complexity is O(N) and space complexity is O(1).

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
