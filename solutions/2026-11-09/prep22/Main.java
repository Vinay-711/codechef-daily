import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] A = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            out.println(largestRectangleArea(N, A));
        }
        out.flush();
        out.close();
    }

    public static long largestRectangleArea(int N, int[] A) {
        Stack<Integer> stack = new Stack<>();
        long maxArea = 0;
        int i = 0;
        while (i < N) {
            if (stack.isEmpty() || A[i] >= A[stack.peek()]) {
                stack.push(i++);
            } else {
                int tp = stack.pop();
                long height = A[tp];
                long width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
        }
        while (!stack.isEmpty()) {
            int tp = stack.pop();
            long height = A[tp];
            long width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
}