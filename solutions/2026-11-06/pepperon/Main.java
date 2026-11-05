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
            int half = n / 2;
            
            int[] leftCount = new int[n];
            int[] rightCount = new int[n];
            int totalP1 = 0;
            int totalP2 = 0;
            
            for (int r = 0; r < n; r++) {
                String row = br.readLine().trim();
                int l = 0;
                int right = 0;
                for (int c = 0; c < half; c++) {
                    if (row.charAt(c) == '1') {
                        l++;
                    }
                }
                for (int c = half; c < n; c++) {
                    if (row.charAt(c) == '1') {
                        right++;
                    }
                }
                leftCount[r] = l;
                rightCount[r] = right;
                totalP1 += l;
                totalP2 += right;
            }
            
            int diff = totalP1 - totalP2;
            int minDiff = Math.abs(diff);
            
            for (int r = 0; r < n; r++) {
                // If row r is reversed, left gets rightCount[r], right gets leftCount[r]
                int newDiff = diff + 2 * (rightCount[r] - leftCount[r]);
                minDiff = Math.min(minDiff, Math.abs(newDiff));
            }
            
            sb.append(minDiff).append("\n");
        }
        System.out.print(sb);
    }
}
