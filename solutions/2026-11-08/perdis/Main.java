import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] p = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (p[i] == i + 1) {
                    count++;
                    if (i + 1 < n) {
                        int temp = p[i];
                        p[i] = p[i + 1];
                        p[i + 1] = temp;
                    }
                }
            }
            out.println(count);
        }
        out.flush();
        out.close();
    }
}