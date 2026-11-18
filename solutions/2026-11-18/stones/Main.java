import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String J = readNonEmptyLine(br);
            String S = readNonEmptyLine(br);
            boolean[] isJewel = new boolean[128]; // ASCII range sufficient for English letters
            for (int i = 0; i < J.length(); i++) {
                isJewel[J.charAt(i)] = true;
            }
            int count = 0;
            for (int i = 0; i < S.length(); i++) {
                if (isJewel[S.charAt(i)]) count++;
            }
            out.append(count).append('\n');
        }
        System.out.print(out.toString());
    }

    private static String readNonEmptyLine(BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.isEmpty()) return line.trim();
        }
        return ""; // should never reach here for valid input
    }
}