import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] isPrime = new boolean[201];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int p = 2; p * p <= 200; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= 200; i += p)
                    isPrime[i] = false;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer>[] pos = new List[101];
            for (int i = 1; i <= 100; i++) pos[i] = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                int val = Integer.parseInt(st.nextToken());
                pos[val].add(i);
            }

            boolean found = false;
            for (int i = 1; i <= 100; i++) {
                if (pos[i].isEmpty()) continue;
                for (int j = 1; j <= 100; j++) {
                    if (pos[j].isEmpty()) continue;
                    if (i == j && pos[i].size() < 2) continue;
                    if (!isPrime[i + j]) {
                        int idx1 = pos[i].get(0);
                        int idx2 = (i == j) ? pos[j].get(1) : pos[j].get(0);
                        out.println(idx1 + " " + idx2);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            if (!found) out.println("-1");
        }
        out.flush();
        out.close();
    }
}