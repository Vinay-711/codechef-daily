import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class Main {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        String tStr = sc.next();
        if (tStr == null) return;
        int T = Integer.parseInt(tStr);

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            long[] dp = new long[N];
            long maxPoints = Long.MIN_VALUE;

            for (int i = N - 1; i >= 0; i--) {
                if (i + K >= N) {
                    dp[i] = A[i];
                } else {
                    dp[i] = A[i] + dp[i + K];
                }
                if (dp[i] > maxPoints) {
                    maxPoints = dp[i];
                }
            }

            out.println(maxPoints);
        }

        out.flush();
    }
}