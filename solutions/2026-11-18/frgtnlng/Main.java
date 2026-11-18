import java.io.*;
import java.util.*;

public class Main {
    private static class FastScanner {
        private final BufferedInputStream in = new BufferedInputStream(System.in);
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = readByte()) != -1 && c <= ' ') ; // skip whitespace
            if (c == -1) return null;
            do {
                sb.append((char) c);
                c = readByte();
            } while (c != -1 && c > ' ');
            return sb.toString();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(fs.next());
        while (T-- > 0) {
            int N = fs.nextInt();
            int K = fs.nextInt();
            String[] dict = new String[N];
            for (int i = 0; i < N; i++) dict[i] = fs.next();
            HashSet<String> used = new HashSet<>();
            for (int i = 0; i < K; i++) {
                int L = fs.nextInt();
                for (int j = 0; j < L; j++) {
                    used.add(fs.next());
                }
            }
            for (int i = 0; i < N; i++) {
                out.append(used.contains(dict[i]) ? "YES" : "NO");
                if (i + 1 < N) out.append(' ');
            }
            out.append('\n');
        }
        System.out.print(out.toString());
    }
}