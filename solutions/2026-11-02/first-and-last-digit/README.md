# First and Last Digit

Problem: https://www.codechef.com/problems/FLOW004

AI-assisted archived practice in Java.

## Approach

Save the last digit with modulo ten, then repeatedly divide by ten until only the first digit remains. Add these two digits. For a one-digit number the digit is counted twice, as required.

Complexity: O(log N) time per case and O(1) auxiliary space, excluding batched output.

## Verification

999 cases: all samples, one-digit inputs, trailing zeros, maximum N, and consecutive small values checked with a string-based oracle.

Run `python3 test_solution.py` in this folder; a local JDK is required.

Judge verdict: **Correct Answer (100%)**. [Submission 1385622054](https://www.codechef.com/viewsolution/1385622054), verified in the official practice UI on November 2, 2026.
