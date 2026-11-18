import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        // read number of test cases
        line = br.readLine();
        while (line != null && line.trim().isEmpty()) line = br.readLine();
        int T = Integer.parseInt(line.trim());
        for (int t = 0; t < T; t++) {
            // read N and K, skipping possible blank lines
            do { line = br.readLine(); } while (line != null && line.trim().isEmpty());
            StringTokenizer st = new StringTokenizer(line);
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int count = 0;
            int read = 0;
            while (read < N) {
                line = br.readLine();
                if (line == null) break;
                if (line.trim().isEmpty()) continue;
                st = new StringTokenizer(line);
                while (st.hasMoreTokens() && read < N) {
                    int val = Integer.parseInt(st.nextToken());
                    if ((val + K) % 7 == 0) count++;
                    read++;
                }
            }
            sb.append(count);
            if (t < T - 1) sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}