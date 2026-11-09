import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String line = br.readLine();
        if (line != null) {
            int t = Integer.parseInt(line.trim());
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                out.println(factorial(n));
            }
        }
        out.flush();
        out.close();
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}