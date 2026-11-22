import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Integer, Integer> freq = new HashMap<>();
            boolean ok = true;
            int total = 2 * N;
            for (int i = 0; i < total; i++) {
                int val = Integer.parseInt(st.nextToken());
                int cnt = freq.getOrDefault(val, 0) + 1;
                if (cnt > 2) {
                    ok = false;
                }
                freq.put(val, cnt);
            }
            out.append(ok ? "Yes" : "No").append('\n');
        }
        System.out.print(out.toString());
    }
}