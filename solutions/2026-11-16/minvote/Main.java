import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line = br.readLine();
        if (line == null) return;
        int T = Integer.parseInt(line.trim());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            long[] S = new long[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) S[i] = Long.parseLong(st.nextToken());
            long[] pref = new long[N + 1];
            for (int i = 0; i < N; i++) pref[i + 1] = pref[i] + S[i];
            int[] diff = new int[N + 1];
            for (int i = 0; i < N; i++) {
                int left = 0, right = i - 1;
                int L = i;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (pref[i] - pref[mid + 1] <= S[i]) {
                        L = mid;
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                left = i + 1; right = N - 1;
                int R = i;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (pref[mid] - pref[i + 1] <= S[i]) {
                        R = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                if (L < i) {
                    diff[L]++;
                    diff[i]--;
                }
                if (R > i) {
                    diff[i + 1]++;
                    diff[R + 1]--;
                }
            }
            int current = 0;
            for (int i = 0; i < N; i++) {
                current += diff[i];
                out.print(current + (i == N - 1 ? "" : " "));
            }
            out.println();
        }
        out.flush();
        out.close();
    }
}