import java.io.*;
public class Main {
 static class Fast {byte[] b=new byte[65536];int p,l;int read()throws Exception{if(p==l){l=System.in.read(b);p=0;if(l<0)return -1;}return b[p++];}long next()throws Exception{int c;do{c=read();}while(c<=32&&c!=-1);long x=0;while(c>32){x=x*10+c-48;c=read();}return x;}}
 static long count(long end,long block){if(end<0)return 0;return 2*(end/block)+1+(end%block==block-1?1:0);}
 public static void main(String[] args)throws Exception{Fast in=new Fast();int t=(int)in.next();StringBuilder out=new StringBuilder();while(t-->0){long n=in.next(),block=Long.highestOneBit(n)<<1;int q=(int)in.next();while(q-->0){long l=in.next(),r=in.next();out.append(count(r,block)-count(l-1,block)).append('\n');}}System.out.print(out);}
}