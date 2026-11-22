public class Main {
    private static final byte[] buffer = new byte[1 << 16];
    private static int ptr = 0, len = 0;
    private static int read() throws java.io.IOException {
        if (ptr >= len) {
            len = System.in.read(buffer);
            ptr = 0;
            if (len <= 0) return -1;
        }
        return buffer[ptr++];
    }
    private static int nextInt() throws java.io.IOException {
        int c, sign = 1, val = 0;
        do {
            c = read();
        } while (c <= ' ' && c != -1);
        if (c == '-') {
            sign = -1;
            c = read();
        }
        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = read();
        }
        return val * sign;
    }
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int T = nextInt();
        while (T-- > 0) {
            int X = nextInt();
            int Y = nextInt();
            int K = nextInt();
            int N = nextInt();
            int need = X - Y;
            boolean possible = false;
            for (int i = 0; i < N; i++) {
                int P = nextInt();
                int C = nextInt();
                if (!possible && P >= need && C <= K) {
                    possible = true;
                }
            }
            sb.append(possible ? "LuckyChef" : "UnluckyChef").append('\n');
        }
        System.out.print(sb.toString());
    }
}