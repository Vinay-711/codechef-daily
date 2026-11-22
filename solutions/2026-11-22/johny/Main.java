import java.io.*;

public class Main {
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        FastScanner(InputStream in) { this.in = in; }
        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        int nextInt() throws IOException {
            int c, sign = 1, val = 0;
            do { c = readByte(); } while (c <= ' ' && c != -1);
            if (c == '-') { sign = -1; c = readByte(); }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val * sign;
        }
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = fs.nextInt();
        while (T-- > 0) {
            int N = fs.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) a[i] = fs.nextInt();
            int K = fs.nextInt();
            int target = a[K - 1];
            int pos = 1;
            for (int i = 0; i < N; i++) {
                if (a[i] < target) pos++;
            }
            sb.append(pos).append('\n');
        }
        System.out.print(sb.toString());
    }
}