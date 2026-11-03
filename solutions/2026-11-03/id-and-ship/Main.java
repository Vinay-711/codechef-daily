import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args) throws Exception {
Scanner in=new Scanner(System.in);int t=in.nextInt();StringBuilder out=new StringBuilder();
while(t-->0){char c=Character.toUpperCase(in.next().charAt(0));String ship;
switch(c){case 'B':ship="BattleShip";break;case 'C':ship="Cruiser";break;case 'D':ship="Destroyer";break;case 'F':ship="Frigate";break;default:throw new IllegalArgumentException("Invalid class ID");}
out.append(ship).append("\n");}System.out.print(out);
 }
}
