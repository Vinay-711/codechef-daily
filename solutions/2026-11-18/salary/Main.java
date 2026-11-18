import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long sum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                int w = Integer.parseInt(st.nextToken());
                sum += w;
                if (w < min) min = w;
            }
            long moves = sum - (long) N * min;
            output.append(moves).append('\n');
        }
        System.out.print(output.toString());
    }
}