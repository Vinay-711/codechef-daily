// AI-assisted archived practice solution.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int a = in.nextInt(), b = in.nextInt();
            out.append(a % b).append('\n');
        }
        System.out.print(out);
    }
}
