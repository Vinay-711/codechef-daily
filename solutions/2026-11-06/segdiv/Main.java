import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String s = br.readLine();
            while (s != null && s.trim().isEmpty()) {
                s = br.readLine();
            }
            if (s == null) break;
            int n = Integer.parseInt(s.trim());
            for (int i = 1; i <= n; i++) {
                int val = 2 * i - (i % 2);
                sb.append(val);
                if (i < n) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
