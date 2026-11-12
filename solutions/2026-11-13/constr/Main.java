import java.io.*;
import java.util.*;

public class Main {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { String l = br.readLine(); if (l == null) return null; st = new StringTokenizer(l); }
                catch (IOException e) { return null; }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
    }

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        String tStr = sc.next();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);
        while (t-- > 0) {
            int n = sc.nextInt();
            String u = sc.next();
            StringBuilder sb = new StringBuilder();
            if (n == 0) {
                out.println();
                continue;
            }
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (u.charAt(i) == u.charAt(i - 1)) {
                    count++;
                } else {
                    if (count % 2 == 0) {
                        sb.append(u.charAt(i - 1)).append(u.charAt(i - 1));
                    } else {
                        sb.append(u.charAt(i - 1));
                    }
                    count = 1;
                }
            }
            if (count % 2 == 0) {
                sb.append(u.charAt(n - 1)).append(u.charAt(n - 1));
            } else {
                sb.append(u.charAt(n - 1));
            }
            out.println(sb.toString());
        }
        out.flush();
        out.close();
    }
}