import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        while (t-- > 0) {
            String nLine = br.readLine();
            if (nLine == null) break;
            int n = Integer.parseInt(nLine.trim());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);
            int[] count = new int[n + 1];
            int maxArrays = 0;
            for (int i = 0; i < n; i++) {
                int val = a[i];
                if (val > n) {
                    count[n]++;
                } else {
                    count[val]++;
                }
            }
            int currentCount = 0;
            for (int i = 1; i <= n; i++) {
                currentCount += count[i];
                int needed = (currentCount + i - 1) / i;
                if (needed > maxArrays) {
                    maxArrays = needed;
                }
            }
            out.println(maxArrays);
        }
        out.flush();
        out.close();
    }
}