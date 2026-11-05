# ==============================================================================
# Platform: CodeChef
# URL: https://www.codechef.com/problems/FLOW001
# Generated: 2026-11-04 23:54:09
#
# Approach:
# The problem requires reading two integers, 'a' and 'b', and printing their sum. It's a standard competitive programming problem, typically involving multiple test cases. The solution first reads the total number of test cases, T. Then, it iterates T times. In each iteration, it reads two space-separated integers 'a' and 'b' from a line, calculates their sum, and prints the result followed by a newline. Fast I/O (`sys.stdin.readline` and `sys.stdout.write`) is used for efficiency, which is crucial in competitive programming. The code is wrapped in a `main` function and executed when the script is run directly.

Time Complexity: O(T), where T is the number of test cases. Each test case involves reading two integers, performing an addition, and printing, all of which are O(1) operations.
Space Complexity: O(1), as only a few variables are stored at any given time, regardless of the input size.
# ==============================================================================

import sys

def main():
    # Read the number of test cases
    T = int(sys.stdin.readline())

    # Process each test case
    for _ in range(T):
        # Read the two integers a and b
        a, b = map(int, sys.stdin.readline().split())
        # Calculate their sum and print it, followed by a newline
        sys.stdout.write(str(a + b) + "\n")

if __name__ == '__main__':
    main()
