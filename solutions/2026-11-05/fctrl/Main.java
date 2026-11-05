import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String line = br.readLine();
        if (line != null) {
            int t = Integer.parseInt(line.trim());
            while (t-- > 0) {
                String nStr = br.readLine();
                if (nStr == null) break;
                long n = Long.parseLong(nStr.trim());
                out.println(countTrailingZeros(n));
            }
        }
        out.flush();
        out.close();
    }

    private static long countTrailingZeros(long n) {
        long count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }
}