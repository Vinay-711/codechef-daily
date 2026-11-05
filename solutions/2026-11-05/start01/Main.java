/* ==============================================================================
 * Platform: CodeChef
 * Language: Java
 * URL: https://www.codechef.com/problems/START01
 * Generated: 2026-11-05 11:18:13
 *
 * Approach:
 * The problem requires reading a single integer N from standard input and printing it directly to standard output. We use BufferedReader to read the input and print the integer. Time Complexity: O(1) and Space Complexity: O(1).
 * ==============================================================================
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line != null) {
            System.out.println(line.trim());
        }
    }
}
