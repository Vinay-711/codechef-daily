import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args) throws Exception {
Scanner in=new Scanner(System.in);int t=in.nextInt();StringBuilder out=new StringBuilder();
while(t-->0){int n=in.nextInt();out.append((int)Math.sqrt(n)).append("\n");}System.out.print(out);
 }
}
