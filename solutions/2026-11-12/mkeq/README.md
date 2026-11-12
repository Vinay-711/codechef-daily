# mkeq

[Original practice problem](https://www.codechef.com/problems/MKEQ)

Date: 2026-11-12 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The core insight for this problem lies in understanding the constraints of the allowed operation. We can only decrease an element `A[i]` if it's a local peak (i.e., `A[i] >= A[i-1]` and `A[i] >= A[i+1]`) and `0 < i < N-1` (using 0-based indexing). This means the first element (`A[0]`) and the last element (`A[N-1]`) can never be decreased or changed. If we want to make all elements equal to some value `X`, then `A[0]` and `A[N-1]` must already be equal to `X`. Therefore, a necessary condition for a solution to exist is `A[0] == A[N-1]`. Let this common value be our target `X`. Since we can only decrease elements, it's also necessary that all elements `A[i]` must be greater than or equal to this target `X` (i.e., `A[i] >= A[0]` for all `i`). If `N=1`, the array is already equal, so the answer is 'YES'. For `N > 1`, if both `A[0] == A[N-1]` and `A[i] >= A[0]` for all `i` hold, it is always possible to make all elements equal to `A[0]`. This is because any element `A[j]` (where `0 < j < N-1`) that is greater than `A[0]` can eventually be decreased. If `A[j]` itself is a local peak, we can decrease it. If not, it must be part of a slope leading to a higher element, or a plateau. Since `A[0]` and `A[N-1]` are fixed at the target level, any 'hill' above this level must contain at least one local peak that can be reduced. This process can be repeated until all elements are flattened to `A[0]`. The algorithm checks these two conditions: `A[0] == A[N-1]` and `A[i] >= A[0]` for all `i`. If `N=1` or both conditions are met, output 'YES', otherwise 'NO'. The time complexity is O(N) per test case to read the array and perform checks, leading to an overall O(sum of N) across all test cases. The space complexity is O(N) for storing the array.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
