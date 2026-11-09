# totcrt

[Original practice problem](https://www.codechef.com/problems/TOTCRT)

Date: 2026-11-09 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem requires aggregating the number of correct submissions for each unique problem code across three divisions. I used a HashMap<String, Long> to store the cumulative sum of submissions for each problem code. For each test case, I read 3*N lines, updating the map with the provided counts. Finally, I extracted the values from the map, sorted them using Arrays.sort, and printed them. The time complexity is O(N log N) due to sorting, and space complexity is O(N) to store the problem codes.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
