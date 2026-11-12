import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while (line != null && line.trim().isEmpty()) {
            line = br.readLine();
        }
        if (line == null) return;
        
        StringTokenizer st = new StringTokenizer(line);
        long n = Long.parseLong(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            while (!st.hasMoreTokens()) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            if (!st.hasMoreTokens()) break;
            
            long q = Long.parseLong(st.nextToken());
            long x = q - n;
            long ans;
            if (x < 2 || x > 2 * n) {
                ans = 0;
            } else if (x <= n + 1) {
                ans = x - 1;
            } else {
                ans = 2 * n - x + 1;
            }
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}