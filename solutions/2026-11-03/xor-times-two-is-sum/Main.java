import java.util.*;
public class Main {static class Fast {byte[] b=new byte[65536];int p,l;int read()throws Exception{if(p==l){l=System.in.read(b);p=0;if(l<0)return -1;}return b[p++];}long next()throws Exception{int c;do{c=read();}while(c<=32&&c!=-1);long x=0;while(c>32){x=x*10+c-48;c=read();}return x;}}
 static long partner(long a){long b=0,previousAnd=0;for(int bit=0;bit<=60;bit++){long x=(a>>>bit)&1,y=x^previousAnd;b|=y<<bit;previousAnd=x&y;}return b;}
 public static void main(String[] args)throws Exception{Fast in=new Fast();int n=(int)in.next();long[] a=new long[n];HashSet<Long> set=new HashSet<>((int)(n/0.75)+1);for(int i=0;i<n;i++){a[i]=in.next();set.add(a[i]);}long count=0;for(long x:a){long y=partner(x);if(x<y&&set.contains(y))count++;}System.out.println(count);}}
