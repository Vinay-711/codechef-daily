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
                StringTokenizer st = new StringTokenizer(br.readLine());
                long n = Long.parseLong(st.nextToken());
                long d = Long.parseLong(st.nextToken());
                
                long infected = 1;
                if (d <= 10) {
                    for (int i = 0; i < d; i++) {
                        infected *= 2;
                        if (infected > n) {
                            infected = n;
                            break;
                        }
                    }
                } else {
                    // First 10 days doubling
                    infected = (long) Math.pow(2, 10);
                    if (infected > n) {
                        infected = n;
                    } else {
                        // Remaining days tripling
                        long remainingDays = d - 10;
                        for (int i = 0; i < remainingDays; i++) {
                            infected *= 3;
                            if (infected > n) {
                                infected = n;
                                break;
                            }
                        }
                    }
                }
                out.println(Math.min(infected, n));
            }
        }
        out.flush();
        out.close();
    }
}