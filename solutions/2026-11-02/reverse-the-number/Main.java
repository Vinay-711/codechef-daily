// AI-assisted archived practice solution.
import java.util.Scanner;
class Main {
    static int solve(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder out = new StringBuilder();
        while (t-- > 0) out.append(solve(in.nextInt())).append('\n');
        System.out.print(out);
    }
}
