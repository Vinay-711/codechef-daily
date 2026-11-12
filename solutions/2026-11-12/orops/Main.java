import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static FastScanner scanner = new FastScanner();

    public static void main(String[] args) throws IOException {
        String tStr = scanner.next();
        if (tStr == null) return;
        int T = Integer.parseInt(tStr);

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            int totalOr = 0;

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
                totalOr |= A[i];
            }

            int count = 0;
            int currentOr = 0;

            for (int i = 0; i < N; i++) {
                currentOr |= A[i];
                if (currentOr == totalOr) {
                    count++;
                    currentOr = 0;
                }
            }

            sb.append(N - count).append("\n");
        }

        System.out.print(sb);
    }

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
}