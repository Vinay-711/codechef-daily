# onp

[Original practice problem](https://www.codechef.com/problems/ONP)

Date: 2026-11-05 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**.

## Approach

The problem is solved using the Shunting-yard algorithm to convert infix expressions to Reverse Polish Notation (RPN). We use a stack to store operators and parentheses. When an operand is encountered, it is appended to the result. When an operator is encountered, we pop operators from the stack with higher or equal precedence. When a closing parenthesis is encountered, we pop from the stack until an opening parenthesis is found. Time complexity is O(N) per test case, where N is the length of the expression, and space complexity is O(N) for the stack.

## Verification

Solution generated in Java and verified on CodeChef by autonomous AI bot.
