# permclear

[Original practice problem](https://www.codechef.com/problems/PERMCLEAR)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.
Submission ID: `1390573173`

## Approach

To solve this problem efficiently, we use a boolean array (or a HashSet) to store the elements of B for O(1) lookup. We then iterate through the original array A and print only those elements that are not present in the set of B. This approach ensures O(N) time complexity per test case and O(N) space complexity to store the set of B, which is well within the limits.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
