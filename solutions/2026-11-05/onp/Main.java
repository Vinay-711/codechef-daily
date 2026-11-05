import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line = br.readLine();
        if (line != null) {
            int t = Integer.parseInt(line.trim());
            while (t-- > 0) {
                String expression = br.readLine();
                if (expression != null) {
                    out.println(toRPN(expression));
                }
            }
        }
        out.flush();
        out.close();
    }

    private static String toRPN(String expr) {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : expr.toCharArray()) {
            if (Character.isLetter(c)) {
                output.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    output.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.toString();
    }

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
}