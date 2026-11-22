import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int T = fs.nextInt();
        while (T-- > 0) {
            int N = fs.nextInt();
            long[] a = new long[N];
            for (int i = 0; i < N; i++) a[i] = fs.nextLong();
            int[] first = new int[N];
            Arrays.fill(first, -1);
            int start = -1, end = -1;
            int cur = 0;
            for (int i = 0; i < N; i++) {
                cur = (int) ((cur + a[i]) % N);
                if (cur == 0) {
                    start = 0;
                    end = i;
                    break;
                }
                if (first[cur] != -1) {
                    start = first[cur] + 1;
                    end = i;
                    break;
                }
                first[cur] = i;
            }
            if (start == -1) {
                out.println("-1");
            } else {
                int size = end - start + 1;
                out.println(size);
                StringBuilder sb = new StringBuilder();
                for (int i = start; i <= end; i++) {
                    sb.append(i + 1);
                    if (i < end) sb.append(' ');
                }
                out.println(sb.toString());
            }
        }
        out.flush();
    }

    // Fast scanner using BufferedReader and StringTokenizer
    private static class FastScanner {
        private final BufferedReader br;
        private StringTokenizer st;
        FastScanner(InputStream is) { br = new BufferedReader(new InputStreamReader(is)); }
        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}