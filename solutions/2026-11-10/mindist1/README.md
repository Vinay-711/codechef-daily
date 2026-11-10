# mindist1

[Original practice problem](https://www.codechef.com/problems/MINDIST1)

Date: 2026-11-10 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The operation of reversing a substring of length 3 allows us to swap adjacent elements if we have enough space, effectively allowing any 1 to move to any position as long as the parity of its index remains the same relative to the other 1s if N is small, but actually, reversing a substring of length 3 allows us to change the parity of the index of a 1. Specifically, if there is at least one 0, we can move 1s closer. If there are at least two 1s, we can always achieve a distance of 1 if there is at least one 0 available to facilitate the movement. If the string contains only 1s, the distance is 1. If there is at least one 0, we can always bring two 1s to be adjacent (distance 1). The only case where the distance cannot be 1 is if the string is '101' and we cannot move them, but the operation allows moving 1s. Actually, for any string with at least two 1s, if there is at least one 0, we can always achieve distance 1. If there are no 0s, the distance is 1. Thus, the answer is 1 unless the string is '101' where the distance is 2.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
