import java.io.*;
import java.util.*;
public class Main {
 static final long MOD=1000000007;
 static int binary(String s){int x=0;for(char c:s.toCharArray())x=x*2+(c=='B'?1:0);return x;}
 public static void main(String[] args){Scanner in=new Scanner(System.in);int t=in.nextInt();StringBuilder out=new StringBuilder();while(t-->0){int n=in.nextInt(),m=in.nextInt(),lo=binary(in.next()),hi=binary(in.next());long[] good=new long[n+1],ways=new long[n+1];good[0]=ways[0]=1;boolean[] prev={true};int mask=(1<<m)-1;for(int len=1;len<=n;len++){boolean[] next=new boolean[1<<len];long count=0;for(int bits=0;bits<next.length;bits++){int suffix=bits&mask;next[bits]=prev[bits>>>1]&&(len<m||suffix<lo||suffix>hi);if(next[bits])count++;}good[len]=count;prev=next;}for(int len=1;len<=n;len++){long total=good[len];for(int run=0;run<len;run++)total=(total+24*good[run]%MOD*ways[len-run-1])%MOD;ways[len]=total;}out.append(ways[n]).append('\n');}System.out.print(out);}
}