import java.io.*;
public class Main {
 static final InputStream in=System.in; static final byte[] b=new byte[65536]; static int p=0,len=0;
 static int read() throws Exception {if(p==len){len=in.read(b);p=0;if(len<0)return -1;}return b[p++];}
 static int nextInt() throws Exception {int c;do{c=read();}while(c<=32&&c!=-1);int x=0;while(c>32){x=x*10+c-48;c=read();}return x;}
 public static void main(String[] args)throws Exception{int n=nextInt(),k=nextInt(),count=0;while(n-->0)if(nextInt()%k==0)count++;System.out.println(count);}
}
