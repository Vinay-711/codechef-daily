import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = null;
        
        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);
        if (!st.hasMoreTokens()) return;
        
        int T = Integer.parseInt(st.nextToken());
        
        while (T-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            if (line == null) break;
            
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            
            long N = n - 1;
            long R = k - 1;
            
            if (R > N - R) {
                R = N - R;
            }
            
            BigInteger ans = BigInteger.ONE;
            for (int i = 1; i <= R; i++) {
                ans = ans.multiply(BigInteger.valueOf(N - R + i)).divide(BigInteger.valueOf(i));
            }
            
            out.println(ans.toString());
        }
        
        out.flush();
    }
}