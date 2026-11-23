import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            String S = br.readLine().trim();
            int[] cnt = new int[26];
            boolean hasDup = false;
            for (int i = 0; i < N; i++) {
                int idx = S.charAt(i) - 'a';
                cnt[idx]++;
                if (cnt[idx] >= 2) {
                    hasDup = true;
                    // no need to continue counting, but we still read whole string already
                }
            }
            if (hasDup) {
                out.println(N - 2);
            } else {
                out.println(-1);
            }
        }
        out.flush();
    }
}