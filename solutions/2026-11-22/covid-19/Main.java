import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int rows = (N + 1) / 2;
            int seatsPerRow = (M + 1) / 2;
            int ans = rows * seatsPerRow;
            sb.append(ans).append('\n');
        }
        System.out.print(sb.toString());
    }
}