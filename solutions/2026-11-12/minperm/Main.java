import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line = br.readLine();
        if (line != null) {
            int t = Integer.parseInt(line.trim());
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                int[] p = new int[n + 1];
                for (int i = 1; i <= n; i++) p[i] = i;

                for (int i = 1; i <= n - 1; i += 2) {
                    if (n % 2 != 0 && i == n - 2) {
                        p[n - 2] = n - 1;
                        p[n - 1] = n;
                        p[n] = n - 2;
                        break;
                    } else {
                        int temp = p[i];
                        p[i] = p[i + 1];
                        p[i + 1] = temp;
                    }
                }

                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= n; i++) {
                    sb.append(p[i]).append(i == n ? "" : " ");
                }
                out.println(sb.toString());
            }
        }
        out.flush();
        out.close();
    }
}