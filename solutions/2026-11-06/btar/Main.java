import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        while (t-- > 0) {
            String nStr = br.readLine();
            while (nStr != null && nStr.trim().isEmpty()) nStr = br.readLine();
            if (nStr == null) break;
            int n = Integer.parseInt(nStr.trim());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] c = new int[4];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                sum += val;
                c[val % 4]++;
            }

            if (sum % 4 != 0) {
                System.out.println(-1);
                continue;
            }

            int ans = 0;
            // Pair 1 and 3
            int p13 = Math.min(c[1], c[3]);
            ans += p13;
            c[1] -= p13;
            c[3] -= p13;

            // Pair 2 and 2
            ans += c[2] / 2;
            c[2] %= 2;

            if (c[2] == 1) {
                if (c[1] >= 2) {
                    ans += 2;
                    c[1] -= 2;
                    c[2] = 0;
                } else if (c[3] >= 2) {
                    ans += 2;
                    c[3] -= 2;
                    c[2] = 0;
                } else {
                    System.out.println(-1);
                    continue;
                }
            }

            ans += (c[1] / 4) * 3;
            ans += (c[3] / 4) * 3;

            System.out.println(ans);
        }
    }
}
