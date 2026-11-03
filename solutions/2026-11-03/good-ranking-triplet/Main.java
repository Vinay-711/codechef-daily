import java.util.*;
public class Main {
 public static void main(String[] args){int n=new Scanner(System.in).nextInt();int bits=32-Integer.numberOfLeadingZeros(n-1);StringBuilder out=new StringBuilder();out.append(4*bits).append('\n');for(int bit=0;bit<bits;bit++)for(int first=0;first<2;first++)for(int reverse=0;reverse<2;reverse++){boolean space=false;for(int group=0;group<2;group++)for(int i=0;i<n;i++){int value=reverse==0?i+1:n-i;if(((value>>bit)&1)!=(first^group))continue;if(space)out.append(' ');space=true;out.append(value);}out.append('\n');}System.out.print(out);}
}