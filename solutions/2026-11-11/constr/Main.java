import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String u = br.readLine();
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